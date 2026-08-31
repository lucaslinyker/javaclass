package br.com.fiap.store.model;

import br.com.fiap.store.exception.InsufficientStockException;

public class Product {
    private int id;
    private String name;
    private int stock;

    public void addStock(int quantity) {
        stock += quantity;
    }

    public void removeStock(int quantity) throws InsufficientStockException {
        if (quantity > stock)
            throw new InsufficientStockException("Insufficient stock, available quantity: " + stock);
        stock -= quantity;
    }

    public Product() {
    }

    public Product(int id, String name, int stock) {
        this.id = id;
        this.name = name;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
