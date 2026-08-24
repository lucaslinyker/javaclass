package br.com.fiap.game.model;

public class SpecialAbility {
    private String name;
    private int energyCost;
    private boolean active;

    public SpecialAbility(String name, int energyCost, boolean active) {
        this.name = name;
        this.energyCost = energyCost;
        this.active = active;
    }

    public void activateAbility() {
        active = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergyCost() {
        return energyCost;
    }

    public void setEnergyCost(int energyCost) {
        this.energyCost = energyCost;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
