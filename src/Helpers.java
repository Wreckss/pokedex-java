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

    public int validation() {
        String[] array = new String[3];
        Scanner stdIn = new Scanner(System.in);

        int unvalidated = -1;
        while (!stdIn.hasNextInt()) {
            System.out.println("Choose the line number of your choice");
            if (stdIn.hasNextInt()) {
                unvalidated = stdIn.nextInt();
                if (unvalidated > array.length) {
                    System.out.println("Must be less than 3.");
                }
            }
            stdIn.next();
        }
        unvalidated = stdIn.nextInt();
        return unvalidated;
    }

}
