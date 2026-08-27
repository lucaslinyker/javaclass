package br.com.fiap.inheritance.model;

public class HotDish extends Product {
    private int serves;

    public HotDish() {
        super();
    }

    public HotDish(String name, String ingredients, double price, int serves) {
        super(name, ingredients, price);
        this.serves = serves;
    }

    @Override
    public String getResume() {
        return "Name: " + this.getName() + "\nIngredients: " + this.getIngredients() + "\nPrice: R$ " + this.getPrice() + "\nServes: " + this.getServes();
    }

    public int getServes() {
        return serves;
    }

    public void setServes(int serves) {
        this.serves = serves;
    }
}
