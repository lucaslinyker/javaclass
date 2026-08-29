package br.com.fiap.ex02.view;

import br.com.fiap.ex02.model.Address;
import br.com.fiap.ex02.model.Programmers;

import java.util.Scanner;

public class ViewProgrammers {
    private static void showMenu() {
        System.out.print("""
                You may select an operation:
                1 - Register/Update programmer
                2 - Show programmer
                3 - Exit
                Type a number for operation:\s""");
    }

    private static Programmers registerProgrammer() {
        Programmers programmer = new Programmers();
        Scanner sc = new Scanner(System.in);

        System.out.print("Provide the programmer's name: ");
        programmer.setName(sc.nextLine());

        System.out.print("Provide the programmer's CPF: ");
        programmer.setCpf(sc.nextLine());

        System.out.print("Provide the programmer's ramal: ");
        programmer.setRamal(sc.nextInt());
        sc.nextLine();

        System.out.print("Provide the programmer's fixed salary: ");
        programmer.setSalary(sc.nextDouble());
        sc.nextLine();

        System.out.println("""
                Provide the street's name,
                the number
                the complement
                the CEP
                the city and state
                pressing Enter at the end of each one:""");
        programmer.setAddress(new Address(sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine()));

        return programmer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Programmers programmer = null;

        int op;
        do {
            showMenu();
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    programmer = registerProgrammer();
                    break;
                case 2:
                    if (programmer != null) {
                        System.out.println(programmer.getDetails());
                    } else {
                        System.out.println("No registered programmers");
                    }
                    break;
                case 3:
                    System.out.println("Finalizing program!");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while (op != 3);
        sc.close();
    }
}
