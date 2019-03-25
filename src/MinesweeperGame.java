package com.javarush.games.minesweeper;
import com.javarush.games.minesweeper.GameObject;
import com.javarush.engine.cell.*;


public class MinesweeperGame extends Game {
    private static final int SIDE = 9;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];
    private boolean isMine;
    private int countMinesOnField;

    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
    }

    private void createGame(){
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                GameObject obj = new GameObject(i, j, false);
                if(getRandomNumber(10) > 0){
                    gameField[j][i] = new GameObject(i, j, true);
                    setCellColor(j, i, Color.ORANGE);
                };

            }
        }
    }
}