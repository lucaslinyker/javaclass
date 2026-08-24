package br.com.fiap.game.view;

import br.com.fiap.game.model.MagicalCharacter;

public class Main {
    public static void main(String[] args) {
        // instance is the class, creates an object
        MagicalCharacter wizard = new MagicalCharacter("Gandalf", 100, "Magic");
        System.out.println(wizard.getName() + " Energy: " + wizard.getEnergyLevel() + " Power: " + wizard.getMagicalPower());

        MagicalCharacter elf = new MagicalCharacter("Legolas", 50, "Archer");
        System.out.println(elf.getName() + " Energy: " + elf.getEnergyLevel() + " Power: " + elf.getMagicalPower());

        // When creating a custom `constructor`, you cannot instantiate an object like this (empty):
        // br.com.fiap.game.model.MagicalCharacter elf = new br.com.fiap.game.model.MagicalCharacter();
        // elf.name = "Legolas";
        // elf.energyLevel = 50;
        // elf.magicalPower = "Archer";
        // unless you create an empty constructor

        MagicalCharacter knight = new MagicalCharacter("White");
        System.out.println(knight.getName() + " Energy: " + knight.getEnergyLevel() + " Power: " + knight.getMagicalPower());
    }
}