package com.company;

public class Magical extends Player implements SuperPower {

    private  int attackType;


    public Magical(int health, int healthDamage) {
        super.setHealth(health);
        super.setDamage(healthDamage);
    }

    public int getAttackType() {
        return attackType;
    }

    public void setAttackType(int attackType) {
        this.attackType = attackType;
    }

    @Override
    public int getHit() {
        return 0;
    }

    @Override
    public void setHit(int hit) {

    }

    @Override
    public String printInfo() {
        return super.printInfo()+ " AttacType "+attackType;
    }

    @Override
    public void superPower() {
        System.out.println("Применил магическую силу");
    }
}

