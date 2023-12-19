package org.fasttrackit.code.exceptionsContinue;

public class NumberTooLargeException extends Exception {
    private int number;

    public NumberTooLargeException(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String getMessage() {
        return "Number %s is too large".formatted(number);
    }

}
