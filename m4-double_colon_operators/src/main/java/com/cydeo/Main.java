package com.cydeo;

import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

       // Predicate<Integer> pred = (p) -> p%2 == 0 ? true : false;

        Calculate sum = (x, y) -> System.out.println(x+y);

        Calculate s1 = (x, y) -> Calculator.findSum(x,y);

    }
}
