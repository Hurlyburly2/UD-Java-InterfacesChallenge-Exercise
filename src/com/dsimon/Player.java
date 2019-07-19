package com.dsimon;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private int level;
    private int currenthealth;
    private int maxhealth;

    public Player(String name) {
        this.name = name;
        this.level = 1;
        this.currenthealth = 10;
        this.maxhealth = 10;
    }

    @Override
    public String toString() {
        String output = this.name + " : " + this.level + " : " + this.currenthealth + "/" + this.maxhealth;
        return output;
    }

    @Override
    public ArrayList<String> save() {
        ArrayList<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, Integer.toString(this.level));
        values.add(2, Integer.toString(this.currenthealth));
        values.add(3, Integer.toString(this.maxhealth));
        return values;
    }

    @Override
    public void read(ArrayList<String> savedValues) {
        if (savedValues.size() == 4) {
            this.name = savedValues.get(0);
            this.level = Integer.parseInt(savedValues.get(1));
            this.currenthealth = Integer.parseInt(savedValues.get(2));
            this.maxhealth = Integer.parseInt(savedValues.get(3));
        } else {
            System.out.println("Improper input of values");
        }
    }
}
