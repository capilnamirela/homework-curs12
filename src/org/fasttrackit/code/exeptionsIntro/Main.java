package org.fasttrackit.code.exeptionsIntro;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  throws FileNotFoundException {
        try{
            BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException exception){
            System.out.println(exception.getMessage());
            System.out.println("The file was not found");
            throw new FileNotFoundException(exception.getMessage());
        }



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int i = scanner.nextInt();
        System.out.println(i);

    }
}
