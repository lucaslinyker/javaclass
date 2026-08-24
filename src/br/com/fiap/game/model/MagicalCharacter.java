package br.com.fiap.game.model;

public class MagicalCharacter {
    private String name;
    private String magicalPower;
    private int energyLevel;

    private SpecialAbility specialAbility;

    // constructor method (most common appear after attributes)
    public MagicalCharacter(String name, int energy, String magicalPower) {
        this.name = name;
        this.magicalPower = magicalPower;
        energyLevel = energy; // if was different there is no problem
    }

    public MagicalCharacter(String name) {
        this.name = name;
    }

    // extremely recommended
    public MagicalCharacter() {}

    public void attack(String attack) {
        if (energyLevel >= 10) {
            System.out.println(name + " carried out an attack: " + attack + "!");
            energyLevel -= 10;
        } else {
            System.out.println(name + " is out of energy to attack.");
        }
    }

    public int increaseEnergy(int energy) {
        energyLevel = energyLevel + energy;
        return energyLevel;
    }

    public void activateSpecialAbility() {
        if (!specialAbility.isActive()) {
            System.out.println("Special ability is not active.");
        } else if (energyLevel >= specialAbility.getEnergyCost()) {
            System.out.println("Activating special ability: " + specialAbility.getName());
            energyLevel -= specialAbility.getEnergyCost();
        } else {
            System.out.println(name + " does not have enough energy to special ability.");
        }
    }

    public String getName() {
        return name;
    }

    public MagicalCharacter setName(String name) {
        this.name = name;
        return this;
    }

    public String getMagicalPower() {
        return magicalPower;
    }

    public MagicalCharacter setMagicalPower(String magicalPower) {
        this.magicalPower = magicalPower;
        return this;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public MagicalCharacter setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
        return this;
    }

    public SpecialAbility getSpecialAbility() {
        return specialAbility;
    }

    public MagicalCharacter setSpecialAbility(SpecialAbility specialAbility) {
        this.specialAbility = specialAbility;
        return this;
    }
}