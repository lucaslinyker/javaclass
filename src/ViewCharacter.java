import java.util.Scanner;

public class ViewCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MagicalCharacter wizard = new MagicalCharacter();

        String option;
        do {
            System.out.print("""
                    Magical character program!
                    1 - Register a character
                    2 - Display character
                    0 - Exit
                    Chose an option:\s"""
            );
            option = sc.nextLine();

            switch (option) {
                case "1":
                    System.out.print("Type a name for your character: ");
                    wizard.name = sc.nextLine();

                    System.out.print("Type a power: ");
                    wizard.magicalPower = sc.nextLine();

                    System.out.print("Type an number for energy level: ");
                    wizard.energyLevel = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.print("Type a name of the special ability: ");
                    String specialAbility = sc.nextLine();
                    
                    System.out.print("Type a number for energy cost: ");
                    int energyCost = sc.nextInt();

                    System.out.print("The special ability is active: (true/false) ");
                    boolean active = sc.nextBoolean();
                    sc.nextLine();

                    // Create an object representing the special ability with the values provided by the user
                    SpecialHability specialHability = new SpecialHability(specialAbility, energyCost, active);
                    // Assign the special ability to the character
                    wizard.specialHability = specialHability;
                    break;
                case "2":
                    sc.reset();
                    System.out.println("Name: " + wizard.name + ", Energy: " + wizard.energyLevel + ", Power: " + wizard.magicalPower);
                    if (wizard.specialHability != null) {
                        System.out.println("Special Ability: " + wizard.specialHability.name + ", Energy Cost: " + wizard.specialHability.energyCost + ", Active: " + wizard.specialHability.active);
                    } else {
                        System.out.println("No special ability registered yet.");
                    }
                    break;
                case "0":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.print("Invalid option.");
                    break;
            }
        } while (!option.equals("0"));

        sc.close();
    }
}