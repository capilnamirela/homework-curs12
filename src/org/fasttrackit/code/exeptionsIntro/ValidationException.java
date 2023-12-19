package org.fasttrackit.code.exeptionsIntro;

public class ValidationException extends RuntimeException{
    private final String message;
    public ValidationException(String massage){
        System.out.println("It's a custom Exception");
        this.message = massage;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
