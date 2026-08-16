public class SpecialAbility {
    String name;
    int energyCost;
    boolean active;

    public SpecialAbility(String name, int energyCost, boolean active) {
        this.name = name;
        this.energyCost = energyCost;
        this.active = active;
    }

    public void activateAbility() {
        active = true;
    }
}
