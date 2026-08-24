package br.com.fiap.game.model;

public class Item {
    private String name;
    private String description;
    private boolean rare;
    private int powerLevel;

    public Item(String name, String description, boolean rare, int powerLevel) {
        this.name = name;
        this.description = description;
        this.rare = rare;
        this.powerLevel = powerLevel;
    }

    public String getName() {
        return name;
    }

    public Item setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Item setDescription(String description) {
        this.description = description;
        return this;
    }

    public boolean isRare() {
        return rare;
    }

    public Item setRare(boolean rare) {
        this.rare = rare;
        return this;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public Item setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
        return this;
    }
}
