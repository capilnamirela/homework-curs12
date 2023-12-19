package org.fasttrackit.homework12.exercices.ex12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NegativeAgeException, AgeTooBigException {

        Scanner scanner = new Scanner(System.in);
        int personAge;
        boolean verif = true;

        while (verif == true) {
            System.out.println("Please input your age: ");
            personAge = scanner.nextInt();

            try {
                System.out.println("Your birth year is: " + BirthYearCalculator.birthYearCalculator(personAge));
                verif = false;
            } catch (NegativeAgeException | AgeTooBigException exception) {
                System.out.println(exception.getMessage());

            }
        }
    }
}
