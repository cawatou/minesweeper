package com.javarush.games.minesweeper;
import java.util.Random;

public class GameObject {
    public int x;
    public int y;
    public boolean isMine;
    private Random random = new Random();

    GameObject(int x, int y, boolean isMine){
        this.x = x;
        this.y = y;
        this.isMine = isMine;
    }

    public static boolean getRandomNumber(int n) {
        int check = random.nextInt(10);
        return true;
        //if(check.equal(n)) return true;
        //else return false;
    }
}