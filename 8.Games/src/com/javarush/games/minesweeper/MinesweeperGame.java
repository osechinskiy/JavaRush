package com.javarush.games.minesweeper;

import com.javarush.engine.cell.*;

public class MinesweeperGame extends Game {
    private static final int SIDE = 9;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];
    private int countMinesOnField = 0;

    @Override
    public void initialize() {
        super.initialize();
        setScreenSize(SIDE, SIDE);
        createGame();
    }

    private void createGame(){
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[0].length; j++) {
                setCellColor(i,j,Color.ORANGE);
                gameField[i][j] = getRandomNumber(10) == 2 ? new GameObject(j, i,true) :  new GameObject(j, i,false);
                if (gameField[i][j].isMine == true){
                    countMinesOnField++;
                }
            }
        }
    }
}
