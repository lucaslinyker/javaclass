package br.com.fiap.ex02.view;

import br.com.fiap.ex02.model.Address;
import br.com.fiap.ex02.model.Salespeople;

import java.util.Scanner;

public class ViewSalespeople {
    private static void showMenu() {
        System.out.print("""
                You may select an operation:
                1 - Register/Update salespeople
                2 - Show salespeople
                3 - Exit
                Type a number for operation:\s""");
    }

    private static Salespeople registerSalespeople() {
        Salespeople pearson = new Salespeople();
        Scanner sc = new Scanner(System.in);

        System.out.print("Provide the salespeople's name: ");
        pearson.setName(sc.nextLine());

        System.out.print("Provide the salespeople's CPF: ");
        pearson.setCpf(sc.nextLine());

        System.out.print("Provide the salespeople's fixed salary: ");
        pearson.setSalary(sc.nextDouble());
        sc.nextLine();

        System.out.print("Provide the salespeople's semiannual sales: ");
        pearson.setSemiannualSales(sc.nextDouble());
        sc.nextLine();

        System.out.println("""
                Provide the street's name,
                the number
                the complement
                the CEP
                the city and state
                pressing Enter at the end of each one:""");
        pearson.setAddress(new Address(sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine()));

        return pearson;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Salespeople pearson = null;

        int op;
        do {
            showMenu();
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    pearson = registerSalespeople();
                    break;
                case 2:
                    if (pearson != null) {
                        System.out.println(pearson.getDetails());
                    } else {
                        System.out.println("No registered salespeople");
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
