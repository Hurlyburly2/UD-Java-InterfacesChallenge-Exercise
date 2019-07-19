package com.dsimon;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ISaveable saveable;

        ArrayList<String> playerOne = new ArrayList<String>();
        playerOne.add("Bob");
        playerOne.add("10");
        playerOne.add("100");
        playerOne.add("100");

        ArrayList<String> playerTwo = new ArrayList<String>();
        playerTwo.add("Joe");
        playerTwo.add("5");
        playerTwo.add("50");
        playerTwo.add("50");

        saveable = new Player("fjal");
        saveable.read(playerOne);
        System.out.println(saveable.save().toString());

        saveable = new Player("fjlas");
        saveable.read(playerTwo);
        System.out.println(saveable.save().toString());

        ArrayList<String> monsterOne = new ArrayList<String>();
        monsterOne.add("MonsterOne");
        monsterOne.add("10");
        monsterOne.add("200");
        monsterOne.add("200");
        saveable = new Monster("jalsfa", 0, 0, 0);
        saveable.read(monsterOne);
        System.out.println(saveable.save().toString());
        ((Monster) saveable).monsterRoar();


        saveObject(saveable);
        loadObject(saveable);
        System.out.println(saveable);
    }

    public static void saveObject(ISaveable objectToSave) {
        for (int i = 0; i < objectToSave.save().size(); i++) {
            System.out.println("Saving " + objectToSave.save().get(i) + " to storage device.");
        }

    }

    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = dummyValues();
        objectToLoad.read(values);
    }

    public static ArrayList<String> dummyValues() {
        ArrayList<String> values = new ArrayList<String>();
        values.add("Joe");
        values.add("5");
        values.add("50");
        values.add("50");
        return values;
    }

//    public static ArrayList<String> readValues() {
//        ArrayList<String> values = new ArrayList<String>();
//
//        Scanner scanner = new Scanner(System.in);
//        boolean quit = false;
//        int index = 0;
//        System.out.println("Choose:");
//        System.out.println("1 to enter a string");
//        System.out.println("0 to quit");
//
//        while(!quit) {
//            System.out.print("Choose an option: ");
//            while (!scanner.hasNextInt()) {
//                System.out.println("Enter an integer");
//                scanner.nextLine();
//            }
//
//            int choice = scanner.nextInt();
//            switch (choice) {
//                case 0:
//                    quit = true;
//                    break;
//                case 1:
//                    System.out.println("Enter a string:");
//                    String stringInput = scanner.nextLine();
//                    values.add(index, stringInput);
//                    break;
//                default:
//                    System.out.println("Invalid number");
//                    scanner.nextLine();
//                    break;
//            }
//        }
//        return values;
//    }
}
