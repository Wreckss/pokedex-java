public class Pokemon {

    private String name;
    private Type type;
    private int level;
    private Stats stats;

    public Pokemon(String name, int type, int level) {
        this.name = name;
        this.type = findType(type);
        this.level = level;
        this.stats = findStats(level);
    }

    private Type findType(int typeIndex) {
        return new Type(typeIndex);
    }

    private Stats findStats(int level) {
        return new Stats(level);
    }

    public Pokemon() { }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public Stats getStats() {
        return stats;
    }

}
