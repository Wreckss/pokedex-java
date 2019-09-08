public class Main {

    public static void main(String[] args) {
        Helpers helpers = new Helpers();
        Trainer trainer = new Trainer();

        trainer.chooseTrainerName();
        helpers.printOutInfo(trainer.chooseStarter());
    }
}
