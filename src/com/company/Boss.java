package com.company;

public class Boss extends Player {
    private int defence;

    public Boss(int health, int healthDamage) {
        super.setHealth(health);
        super.setDamage(healthDamage);
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    @Override
    public String printInfo() {
       return super.printInfo()+ " Defence "+defence;
    }
}