public class Type extends Pokemon {

    private String typeString;

    public Type(int typeIndex) {
        if (typeIndex >= 1 && typeIndex < 3) {
            this.typeString = determineType(typeIndex);
        } else {
            this.typeString = determineType(typeIndex);
        }
    }

    private String determineType(int index) {
        String[] types = new String[]{
                "unknown type",
                "Grass",
                "Water",
                "Fire"
        };
        return types[index];
    }

    public String getTypeString() {
        return typeString;
    }
}
