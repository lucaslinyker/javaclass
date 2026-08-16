public class MagicalCharacter {
    String name;
    String magicalPower;
    int energyLevel;

    SpecialAbility specialAbility;

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
        if (!specialAbility.active) {
            System.out.println("Special ability is not active.");
        } else if (energyLevel >= specialAbility.energyCost) {
            System.out.println("Activating special ability: " + specialAbility.name);
            energyLevel -= specialAbility.energyCost;
        } else {
            System.out.println(name + " does not have enough energy to special ability.");
        }
    }
}