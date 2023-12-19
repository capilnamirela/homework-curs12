package org.fasttrackit.code.exceptionsContinue;

public class MathService {
    public static int computePower(int number, int power) throws NegativeNumberException, PowerTooLargeException, NumberTooLargeException{
        if(number < 0){
            throw new NegativeNumberException("We don't like negative numbers!");
        }

        if(power > 10){
            throw new PowerTooLargeException("The power is too big");
        }

        if(number > 1000){
            throw new NumberTooLargeException(number);
        }

        return (int) Math.pow(number, power);
    }
}
