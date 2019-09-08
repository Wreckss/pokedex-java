import java.util.Scanner;

public class Trainer extends Helpers {

    private Scanner stdIn = new Scanner(System.in);
    private String trainerName;

    public void chooseTrainerName() {


        System.out.println("Choose your Trainer's name! : ");
        String rawName = stdIn.next().toLowerCase();
        trainerName = Character.toUpperCase(rawName.charAt(0)) + rawName.substring(1);
    }

    public String getTrainerName() {
        return trainerName;
    }

    public Pokemon chooseStarter() {
        String[] starters = new String[] {
                "Bulbasaur", "Squirtle", "Charmander"
        };

        System.out.printf("Alright %s, choose your starter pokemon:%n", trainerName);
        for (int i = 0; i < starters.length; i++) {
            System.out.printf("%s: %s%n", i+1, starters[i]);
        }

        int choice = validation();

        String starterName = "bugged";
        int starterType = -1;

        if (choice == 1) {
            starterName = starters[0];
            starterType = 1;
        } else if (choice == 2) {
            starterName = starters[1];
            starterType = 2;
        } else if (choice == 3) {
            starterName = starters[2];
            starterType = 3;
        }
        return new Pokemon(starterName, starterType,1);
    }

}
