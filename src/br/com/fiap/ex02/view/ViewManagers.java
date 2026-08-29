package br.com.fiap.ex02.view;

import br.com.fiap.ex02.model.Address;
import br.com.fiap.ex02.model.Managers;

import java.util.Scanner;

public class ViewManagers {
    private static void showMenu() {
        System.out.print("""
                You may select an operation:
                1 - Register/Update manager
                2 - Show manager
                3 - Exit
                Type a number for operation:\s""");
    }

    private static Managers registerManager() {
        Managers manager = new Managers();
        Scanner sc = new Scanner(System.in);

        System.out.print("Provide the manager's name: ");
        manager.setName(sc.nextLine());

        System.out.print("Provide the manager's CPF: ");
        manager.setCpf(sc.nextLine());

        System.out.print("Provide the manager's fixed salary: ");
        manager.setSalary(sc.nextDouble());
        sc.nextLine();

        System.out.print("Provide the manager's office: ");
        manager.setSalary(sc.nextDouble());
        sc.nextLine();

        System.out.print("Provide the manager's ramal: ");
        manager.setRamal(sc.nextInt());
        sc.nextLine();

        System.out.print("Provide the manager's semiannual revenue: ");
        manager.setSemiannualRevenue(sc.nextDouble());
        sc.nextLine();

        System.out.println("""
                Provide the street's name,
                the number
                the complement
                the CEP
                the city and state
                pressing Enter at the end of each one:""");
        manager.setAddress(new Address(sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine()));

        return manager;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Managers manager = null;

        int op;
        do {
            showMenu();
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    manager = registerManager();
                    break;
                case 2:
                    if (manager != null) {
                        System.out.println(manager.getDetails());
                    } else {
                        System.out.println("No registered managers");
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
