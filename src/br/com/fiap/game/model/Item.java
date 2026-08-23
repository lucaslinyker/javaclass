package br.com.fiap.game.model;

public class Item {
    public String name;
    public String description;
    public boolean rare;
    public int powerLevel;

    public Item(String name, String description, boolean rare, int powerLevel) {
        this.name = name;
        this.description = description;
        this.rare = rare;
        this.powerLevel = powerLevel;
    }
}
