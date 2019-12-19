package com.company;

public class Warrior extends Player implements SuperPower {

    private int hit;

    public Warrior(int health, int healthDamage) {
        super.setHealth(health);
        super.setDamage(healthDamage);
    }

    @Override
    public int getHit() {
        return hit;
    }

    @Override
    public void setHit(int hit) {
        this.hit = hit;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + " Hit " + hit;
    }

    @Override
    public void superPower() {
        System.out.println("\uD83D\uDD31");
    }
}
