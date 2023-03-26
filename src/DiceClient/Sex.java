package DiceClient;

public enum Sex {
    MASCULINE, FEMININE;
    @Override
    public String toString() {
        return switch (this) {
            case MASCULINE -> "Masculino";
            case FEMININE -> "Feminino";
        };
    }
}
