package com.company;

public class Mental extends Player implements Printable {

    private int attackType;


    public Mental(int health, int healthDamage) {
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
        return super.printInfo() + " attactype " + attackType;
    }

    @Override
    public void print() {
        System.out.println("Ударил мечом");
    }
}