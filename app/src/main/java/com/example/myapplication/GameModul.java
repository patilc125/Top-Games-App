package com.example.myapplication;

public class GameModul {
    private String gamename;
    private int gp;

    public GameModul(String gamename, int gp) {
        this.gamename = gamename;
        this.gp = gp;
    }

    public String getGamename() {
        return gamename;
    }

    public void setGamename(String gamename) {
        this.gamename = gamename;
    }

    public int getGp() {
        return gp;
    }

    public void setGp(int gp) {
        this.gp = gp;
    }
}
