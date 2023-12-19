package org.fasttrackit.homework.ex2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PersonService service = new PersonService(List.of(
                new Person("Mihai", 22, "black"),
                new Person("Ana", 24, "blonde"),
                new Person("Ionela", 34, "black")
        ));
        System.out.println(service.mapNameToAge());
        System.out.println(service.mapHairColorToName());
    }

}
