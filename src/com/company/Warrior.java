package com.company;

import com.company.Player;

public class Warrior extends Player {

    private int hit;

    public Warrior(int health, int healthDamage) {
        super.setHealth(health);
        super.setDamage(healthDamage);
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }
    @Override
    public String printInfo() {
        return super.printInfo()+ " Hit "+hit;
    }}
