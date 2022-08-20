package com.cydeo.task;

import java.util.List;

import static java.util.Comparator.comparing;

public class DishTask {
    public static void main(String[] args) {

        List<Dish> dishes = DishData.getAll();

        System.out.println("Print all dish's name that has less than 400 calories");
        dishes.stream()
                .filter(i -> i.getCalories() < 400)
                .map(Dish::getName)
                .forEach(System.out::println);

        System.out.println("----------------------------------------");

        System.out.println("Print the length of the name of each dish");
        dishes.stream()
                .map(i -> i.getName().length())
                .forEach(System.out::println);

        System.out.println("----------------------------------------");

        System.out.println("Print three high calorie dish name (>300)");
        dishes.stream()
                .filter(i -> i.getCalories() > 300)
                .limit(3)
                .map(Dish::getName)
                .forEach(System.out::println);

        System.out.println("----------------------------------------");

        System.out.println("Print all dish name that are below 400 calories in sorted");
        dishes.stream()
                .filter(i -> i.getCalories() < 400)
                .sorted(comparing(Dish::getCalories))
                .map(Dish::getName)
                .forEach(System.out::println);




    }
}
