package org.fasttrackit.homework12.exercices.ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please introduce number: ");
        int number = scanner.nextInt();

        System.out.println("Sum of digits is: " + IntTools.digitSum(number));
        System.out.println("The last digit is: " + IntTools.lastDigit(number));

        System.out.println("Introduce de position of the digit you want: ");
        int position = scanner.nextInt();

        try {
            System.out.println("At the position: " + position + " the digit is: " + IntTools.digitAtPosition(number, position));
        } catch (InvalidPosition exception){
            System.out.println(exception.getMessage());
        }
    }
}
