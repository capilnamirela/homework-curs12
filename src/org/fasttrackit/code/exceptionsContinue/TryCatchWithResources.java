package org.fasttrackit.code.exceptionsContinue;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TryCatchWithResources {
    public static void main(String[] args) throws NegativeNumberException, NumberTooLargeException, PowerTooLargeException, IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Please enter a power: ");
        int power = scanner.nextInt();
        BufferedWriter errorWriter = new BufferedWriter(new FileWriter("error.txt"));
        errorWriter.write("This is an error File");
        errorWriter.newLine();

        try (BufferedWriter successWriter = new BufferedWriter(new FileWriter("success.txt"))) {
            successWriter.write("The result: " + MathService.computePower(number, power));
            successWriter.newLine();
        } catch (PowerTooLargeException | NegativeNumberException exeption) {
           errorWriter.write(exeption.getMessage());
        } catch (NumberTooLargeException exception) {
            System.out.println(MathService.computePower(exception.getNumber() / 10, power));
        } finally {
            errorWriter.close();
            System.out.println("We are finished");
        }
    }
}
