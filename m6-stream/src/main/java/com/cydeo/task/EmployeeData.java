package com.cydeo.task;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll(){
        return Stream.of(
                new Employee(100,"Mike","mike@cydeo.com", Arrays.asList("2022028765", "7038964583")),
                new Employee(101,"Ozzy","ozzy@cydeo.com", Arrays.asList("4122588765", "8997426583")),
                new Employee(102,"Peter","peter@cydeo.com", Arrays.asList("5166998765", "6198459583"))
        );
    }
}
