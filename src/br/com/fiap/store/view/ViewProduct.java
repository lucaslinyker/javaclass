package br.com.fiap.store.view;

import br.com.fiap.store.exception.InsufficientStockException;
import br.com.fiap.store.model.Product;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ViewProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product product = new Product(1, "Test product", 10);

        int op;
        do {
            System.out.print("""
                    Chose:
                    1 - Add to stock
                    2 - Remove from stock
                    0 - Exit
                    """);
            op = sc.nextInt();

            switch (op) {
                case 1:
                    try {
                        System.out.print("Type a quantity to add: ");
                        int qty = sc.nextInt();
                        product.addStock(qty);
                        System.out.println("Actual stock: " + product.getStock());
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid typed value to quantity");
                        sc.nextLine();
                    }
                    break;
                case 2:
                    try {
                        System.out.print("Type a quantity to remove: ");
                        int qty = sc.nextInt();
                        product.removeStock(qty);
                        System.out.println("Actual stock: " + product.getStock());
                    } catch (InsufficientStockException e) {
                        System.err.println(e.getMessage());
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid typed value to quantity");
                        sc.nextLine();
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while (op != 0);
        sc.close();
    }
}
