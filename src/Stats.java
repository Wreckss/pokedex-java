public class Stats extends Pokemon {

    private double health;
    private double attack;
    private double defense;

    public Stats(int level) {

        Object[][] stats = new Object[][] {
                { "health", determineHealth(level) },
                { "attack", determineAttack(level) },
                { "defense", determineDefense(level) }
        };
        health = (double) stats[0][1];
        attack = (double) stats[1][1];
        defense = (double) stats[2][1];
    }

    private double determineHealth(int level) {
        return level * 10;
    }

    private double determineAttack(int level) {
        return level * 1.5;
    }

    private double determineDefense(int level) {
        return level;
    }

    public double getHealth() {
        return health;
    }

    public double getAttack() {
        return attack;
    }

    public double getDefense() {
        return defense;
    }
}
