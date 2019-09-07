import java.util.Scanner;

public class Trainer {

    private String trainerName;

    public void chooseName() {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("Choose your Trainer's name! : ");
        trainerName = stdIn.next();
    }

    public String getTrainerName() {
        return trainerName;
    }
}
