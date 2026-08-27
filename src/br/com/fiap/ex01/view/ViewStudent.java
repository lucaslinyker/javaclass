package br.com.fiap.ex01.view;

import br.com.fiap.ex01.model.City;
import br.com.fiap.ex01.model.Address;
import br.com.fiap.ex01.model.Student;

import java.util.Scanner;

public class ViewStudent {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int op;
        Student student = new Student();

        do {
            System.out.print("""
                    Student program!
                    1 - Register a student
                    2 - Display student
                    0 - Exit
                    Chose an option:\s"""
            );
            op = sc.nextInt();

            switch (op){
                case 1:
                    System.out.print("What is the student's name? ");
                    String nome = sc.next() + sc.nextLine();
                    System.out.print("What is the RM? ");
                    int rm = sc.nextInt();
                    System.out.print("What is the student's street address? ");
                    String street = sc.next() + sc.nextLine();
                    System.out.print("What is the number? ");
                    int number = sc.nextInt();
                    System.out.print("What is the CEP? ");
                    int cep = sc.nextInt();

                    System.out.print("What is the name of the city? ");
                    String cityName = sc.next() + sc.nextLine();
                    System.out.print("What is the state of the city? ");
                    String state = sc.next() + sc.nextLine();

                    City city = new City(cityName, state);
                    Address address = new Address(street, number, cep, city);
                    student.setName(nome)
                            .setRm(rm)
                            .setAddress(address);
                    System.out.println("Student registered!");
                    break;
                case 2:
                    System.out.println("Name: " + student.getName() + ", RM: " + student.getRm());

                    final Address addr = student.getAddress();
                    if (addr != null) {
                        System.out.printf("Street: %s, Number: %d, CEP: %d\n", addr.getStreet(), addr.getNumber(), addr.getCep());
                        System.out.println(addr.getCity().getName() + " - " + addr.getCity().getState());
                    } else {
                        System.out.println("No address registered yet.");
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