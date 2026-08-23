package br.com.fiap.game.model;

public class SpecialAbility {
    public String name;
    public int energyCost;
    public boolean active;

    public SpecialAbility(String name, int energyCost, boolean active) {
        this.name = name;
        this.energyCost = energyCost;
        this.active = active;
    }

    public void activateAbility() {
        active = true;
    }
}
