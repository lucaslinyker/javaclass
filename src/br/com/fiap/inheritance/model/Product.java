package br.com.fiap.inheritance.model;

public abstract class Product {
    private String name;
    private String ingredients;
    private double price;

    public Product() {}

    public Product(String name, String ingredients, Double price) {
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
    }

    public abstract String getResume();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
