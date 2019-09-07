public class Main {

    public static void main(String[] args) {
        Helpers helpers = new Helpers();
        Trainer trainer = new Trainer();

        Pokemon bulba = new Pokemon("Bulbasaur", 1, 1);
//
//        helpers.printOutInfo(bulba);

        trainer.chooseTrainerName();
        trainer.printOutInfo(bulba);
        //trainer.chooseStarter();
        helpers.printOutInfo(trainer.chooseStarter());
    }
}
