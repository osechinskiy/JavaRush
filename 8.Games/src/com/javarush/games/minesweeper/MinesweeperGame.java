package com.javarush.games.minesweeper;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

import java.util.ArrayList;
import java.util.List;

public class MinesweeperGame extends Game {
    private static final int SIDE = 9;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];
    private int countMinesOnField;
    private static final String MINE = "\uD83D\uDCA3";
    private static final String FLAG = "\uD83D\uDEA9";
    private int countFlags;
    private boolean isGameStopped;
    private int countClosedTiles = SIDE * SIDE;
    private int score;


    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
    }

    private void createGame() {
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                boolean isMine = getRandomNumber(10) < 1;
                if (isMine) {
                    countMinesOnField++;
                }
                gameField[y][x] = new GameObject(x, y, isMine);
                setCellColor(x, y, Color.DARKSLATEGRAY);
                setCellValue(x, y, "");
            }
        }
        countMineNeighbors();
        countFlags = countMinesOnField;
    }

    private List<GameObject> getNeighbors(GameObject gameObject) {
        List<GameObject> result = new ArrayList<>();
        for (int y = gameObject.y - 1; y <= gameObject.y + 1; y++) {
            for (int x = gameObject.x - 1; x <= gameObject.x + 1; x++) {
                if (y < 0 || y >= SIDE) {
                    continue;
                }
                if (x < 0 || x >= SIDE) {
                    continue;
                }
                if (gameField[y][x] == gameObject) {
                    continue;
                }
                result.add(gameField[y][x]);
            }
        }
        return result;
    }

    private void countMineNeighbors(){
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                GameObject gameObject = gameField[y][x];
                if (!gameObject.isMine) {
                    for (GameObject neighbor : getNeighbors(gameObject)) {
                        if (neighbor.isMine) {
                            gameObject.countMineNeighbors++;
                        }
                    }
                }
            }
        }
    }

    private void openTile(int x, int y){
        GameObject gameObject = gameField[y][x];
        if(gameObject.isOpen || gameObject.isFlag || isGameStopped){
            return;
        } else {
            gameObject.isOpen = true;
            setCellColor(x, y, Color.ORANGE);
            countClosedTiles--;
            if (gameObject.isMine) {
                //setCellValue(gameObject.x, gameObject.y, MINE);
                setCellValueEx(gameObject.x, gameObject.y, Color.RED, MINE);
                gameOver();
                return;
            } else if (gameObject.countMineNeighbors == 0) {
                setCellValue(gameObject.x, gameObject.y, "");
                setCellColor(gameObject.x, gameObject.y, Color.DARKORANGE);
                List<GameObject> neighbors = getNeighbors(gameObject);
                for (GameObject neighbor : neighbors) {
                    if (!neighbor.isOpen) {
                        openTile(neighbor.x, neighbor.y);
                    }
                }
            } else {
                setCellNumber(x, y, gameObject.countMineNeighbors);
            }
            score += 5;
            setScore(score);
            if (countClosedTiles == countMinesOnField) {
                win();
            }
        }
    }
    private void markTile(int x, int y) {
        GameObject gameObject = gameField[y][x];

        if (gameObject.isOpen || (!gameObject.isFlag && countFlags == 0) || isGameStopped) {
            return;
        }
        if (gameObject.isFlag) {
            gameObject.isFlag = false;
            countFlags++;
            setCellValue(x, y, "");
            setCellColor(x, y, Color.DARKSLATEGRAY);
        } else {
            gameObject.isFlag = true;
            countFlags--;
            setCellValue(x, y, FLAG);
            setCellColor(x, y, Color.ORANGERED);
        }
    }

    @Override
    public void onMouseLeftClick(int x, int y) {
        if (isGameStopped) {
            restart();
            return;
        }
       openTile(x, y);
    }

    @Override
    public void onMouseRightClick(int x, int y) {
      markTile(x, y);
    }

    private void gameOver(){
        isGameStopped = true;
        showMessageDialog(Color.ALICEBLUE, "GAME OVER!", Color.BLACK, 25);
    }
    private void win(){
        isGameStopped = true;
        showMessageDialog(Color.ALICEBLUE, "WELL DONE DUDE!!", Color.BLACK, 25);
    }

    private void restart(){
        isGameStopped = false;
        countClosedTiles = SIDE * SIDE;
        score = 0;
        countMinesOnField = 0;
        setScore(score);
        createGame();

    }
}