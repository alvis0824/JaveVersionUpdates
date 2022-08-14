package com.cydeo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> items = new ArrayList<>();  //Arraylist only accepts objects belongs to Integer class
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);

        printDouble(items);
    }

    private static void printDouble(ArrayList<Integer> items) {
        for(Integer i : items){
            System.out.println(i * 2);
        }
    }
}
