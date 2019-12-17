package com.company;

public class Magical extends Player {

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
    public String printInfo() {
        return super.printInfo()+ " AttacType "+attackType;
    }
}

