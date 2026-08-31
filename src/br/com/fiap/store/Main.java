package br.com.fiap.store;

import java.util.Scanner;

// Error <> Exception
// inside a try block can have many catches

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number;

        System.out.println("Type a number:");
        try {
            number = sc.nextDouble();
            System.out.println("Value: " + number);
        } catch (Exception e) {
            System.out.println("Occurred an exception!");
        } finally {
            System.out.println("Finalizing program.");
        }
    }
}
