import java.util.InputMismatchException;
import java.util.Scanner;

public class Helpers {

    public void printOutInfo(Pokemon pokemon) {
        String[][] labels = new String[][] {
                { "Pokemon", pokemon.getName() },
                { "Level", String.valueOf(pokemon.getLevel()) },
                { "Type", String.valueOf(pokemon.getType().getTypeString()) },
                { "Health", String.valueOf(pokemon.getStats().getHealth()) },
                { "Attack", String.valueOf(pokemon.getStats().getAttack()) },
                { "Defense", String.valueOf(pokemon.getStats().getDefense()) }
        };

        for (String[] label : labels) {
            System.out.printf("%s: ", label[0]);
            for (int j = 0; j < 1; j++) {
                System.out.printf("%s%n", label[1]);
            }
        }

        //System.out.println(Arrays.deepToString(labels));
    }

    public int validateInts(String userInput, String[] list) {
        Scanner stdIn = new Scanner(System.in);
        int validatedInt = -99;
        boolean valid = false;

        //while (!valid) {
            try {
                validatedInt = Integer.parseInt(userInput);
                //valid = true;
                return validatedInt;
            } catch (InputMismatchException ie) {
                System.out.println("something broke during validation.");
            }
       // }

        while (!stdIn.hasNextInt()) {
            System.out.println("Enter the line number of your choice.");
            if (stdIn.hasNextInt()) {
                if (stdIn.nextInt() > list.length && stdIn.nextInt() < 0) {
                    System.out.println("Select 1, 2, or 3.");
                }
            }
            stdIn.next();
        }
        while (stdIn.nextInt() > list.length && stdIn.nextInt() < 0) {
            System.out.println("Select 1, 2, or 3.");
            return validatedInt = stdIn.nextInt();
        }
        return validatedInt;
    }

}
