package org.example;

public class Riders extends Army{
    int horses;
    int armor;

    public Riders(String rank, int count, int horses, int armor) {
        super(rank, count);
        this.horses = horses;
        this.armor = armor;
    }
}
