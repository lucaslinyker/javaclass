package br.com.fiap.inheritance.model;

// note: subclass inherits all attributes and methods, but not the constructors
public class Drink extends Product {
    private int quantity;

    public Drink() {
        // note: when it is empty, Java automatically includes it.
        super(); // invokes the parent class constructor
    }

    public Drink(String name, String ingredients, double price, int quantity) {
        super(name, ingredients, price); // super() always on the first line
        this.quantity = quantity;
    }

    @Override
    public String getResume() {
        return "Name: " + this.getName() + "\nIngredients: " + this.getIngredients() + "\nPrice: R$ " + this.getPrice() + "\nQuantity: " + this.getQuantity();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
