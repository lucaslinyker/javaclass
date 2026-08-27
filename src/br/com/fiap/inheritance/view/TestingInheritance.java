package br.com.fiap.inheritance.view;

import br.com.fiap.inheritance.model.Drink;
import br.com.fiap.inheritance.model.HotDish;
import br.com.fiap.inheritance.model.Product;

public class TestingInheritance {
    public static void main(String[] args) {
        // note: an abstract class cannot be instanced (new)
        // Product p = new Product();

        Drink drink = new Drink("Orange Juice", "Water, orange, sugar, ice", 7.85, 500);
        System.out.print("The reported drink was " + drink.getName());
        System.out.print(", is composed of " + drink.getIngredients());
        System.out.print(", its costs R$ " + drink.getPrice());
        System.out.println(" and its quantity is " + drink.getQuantity() + "ml");

        HotDish hotDish = new HotDish();
        hotDish.setName("Pizza");
        hotDish.setIngredients("Tomatoes, cheese, olives, mushrooms");
        hotDish.setPrice(12.99);
        hotDish.setServes(2);
        System.out.print("The reported dish was " + hotDish.getName());
        System.out.print(", is composed of " + hotDish.getIngredients());
        System.out.print(", its costs R$ " + hotDish.getPrice());
        System.out.print(" and its serves " + hotDish.getServes());

        System.out.println("\n");
        System.out.println(drink.getResume());
        System.out.println();
        System.out.println(hotDish.getResume());
    }
}
