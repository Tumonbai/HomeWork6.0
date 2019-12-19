package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss(200, 30);
        Warrior warrior = new Warrior(150, 20);
        Magical magical = new Magical(220, 25);
        Mental mental = new Mental(150, 30);
        boss.setDefence(15);
        warrior.setHit(43);
        magical.setAttackType(344);
        mental.setAttackType(200);
        System.out.println(boss.printInfo());
        System.out.println(warrior.printInfo());
        System.out.println(magical.printInfo());
        System.out.println(mental.printInfo());

    }
}
