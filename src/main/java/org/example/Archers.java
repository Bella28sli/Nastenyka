package org.example;

public class Archers extends Army{
    private int bowLevel;
    private int aroowsLevel;
    public Archers(String rank, int count, int bowLevel, int aroowsLevel) {
        super(rank, count);
        this.bowLevel = bowLevel;
        this.aroowsLevel = aroowsLevel;
    }
}
