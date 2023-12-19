package org.fasttrackit.homework12.exercices.ex12;

import java.time.LocalDateTime;

public class BirthYearCalculator {

    public static int birthYearCalculator(int age) throws NegativeAgeException, AgeTooBigException {
        LocalDateTime currentDate = LocalDateTime.now();

        if (age < 0) {
            throw new NegativeAgeException("Age " + age + " is invalid! It is not possible to have a negative age!");
        }

        if (age > 150) {
            throw new AgeTooBigException("Age " + age + " is too big! You have to introduce a number smaller than 150!");
        }

        return currentDate.getYear() - age;

    }
}
