package com.dsimon;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int goldDrop;
    private int currentHealth;
    private int maxHealth;
    private int damage;

    public Monster(String name, int goldDrop, int maxHealth, int damage) {
        this.name = name;
        this.goldDrop = goldDrop;
        this.currentHealth =  maxHealth;
        this.maxHealth = maxHealth;
        this.damage = damage;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        String output = this.name + " : " + "Drops " + this.goldDrop + " gold : " + this.currentHealth + "/" + this.maxHealth + " : " + "Damage: " + this.damage;
        return output;
    }

    @Override
    public ArrayList<String> save() {
        ArrayList<String> monsterStats= new ArrayList<String>();
        monsterStats.add(0, this.name);
        monsterStats.add(1, Integer.toString(this.goldDrop));
        monsterStats.add(2, Integer.toString(this.currentHealth));
        monsterStats.add(3, Integer.toString(this.maxHealth));
        return monsterStats;
    }

    @Override
    public void read(ArrayList<String> savedValues) {
        if (savedValues.size() == 4) {
            this.name = savedValues.get(0);
            this.goldDrop = Integer.parseInt(savedValues.get(1));
            this.currentHealth = Integer.parseInt(savedValues.get(2));
            this.maxHealth = Integer.parseInt(savedValues.get(3));
        } else {
            System.out.println("Invalid input");
        }
    }

    public void monsterRoar() {
        System.out.println("RAAAAH");
    }
}
