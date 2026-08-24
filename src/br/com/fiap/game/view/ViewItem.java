package br.com.fiap.game.view;

import br.com.fiap.game.model.Item;

import java.util.Scanner;

public class ViewItem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item item = null;

        int op;
        do {
            System.out.print("""
                    View Item program!
                    1 - Register item
                    2 - Display item
                    0 - Exit
                    Chose an option:\s"""
            );
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Type a name of item: ");
                    String name = sc.next() + sc.nextLine();
                    System.out.println("Type a description of item: ");
                    String description = sc.next() + sc.nextLine();
                    System.out.println("Is it a rare item? (true/false): ");
                    boolean rare = sc.nextBoolean();
                    System.out.println("Type a power level of item: ");
                    int powerLevel = sc.nextInt();
                    item = new Item(name, description, rare, powerLevel);
                    break;
                case 2:
                    if (item != null) {
                        System.out.println("Name: " + item.getName() + ", Description: " + item.getDescription() + ", Is it rare: " + item.isRare() + ", Power level: " + item.getPowerLevel());
                    } else {
                        System.out.println("No item registered yet.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.print("Invalid option.");
                    break;
            }
        } while (op != 0);
        sc.close();
    }
}
