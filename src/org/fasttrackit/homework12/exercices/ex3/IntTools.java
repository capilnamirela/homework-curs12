package org.fasttrackit.homework12.exercices.ex3;

public class IntTools {
    public static int digitSum(int number) {
        String[] digits = String.valueOf(number).split("");
        int sumOfDigits = 0;
        for (String digit : digits) {
            sumOfDigits += Integer.parseInt(digit);
        }
        return sumOfDigits;
    }

    public static int lastDigit(int number) {
        String[] digits = String.valueOf(number).split("");
        return Integer.parseInt(digits[digits.length - 1]);

    }

    public static int digitAtPosition(int number, int position) throws InvalidPosition {
        String[] digits = String.valueOf(number).split("");
        if (position < 0) {
            throw new InvalidPosition("No negative positions!");
        }
        if (position >= digits.length){
            throw new InvalidPosition("The number is smaller, we don't have position " + position);
        }

        return Integer.parseInt(digits[position]);
    }


}
