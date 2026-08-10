public class MagicalCharacter {
    String name;
    String magicalPower;
    int energyLevel;

    SpecialHability specialHability;

    // extremely recommended
    public MagicalCharacter() {}

    // constructor method (most common appear after attributes)
    public MagicalCharacter(String name, int energy, String magicalPower) {
        this.name = name;
        this.magicalPower = magicalPower;
        energyLevel = energy; // if was different there is no problem
    }

    public MagicalCharacter(String name) {
        this.name = name;
    }
}