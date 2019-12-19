package com.company;

public abstract class Player {

    private int Health;
    private int Damage;

    public Player() {
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public abstract int getHit();

    public abstract void setHit(int hit);

    public String printInfo() {
        return "Health " + getHealth() + " Damage " + getDamage();
    }
}
