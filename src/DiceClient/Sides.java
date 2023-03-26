package DiceClient;

public enum Sides {
    LEFT, RIGHT, BETWEEN;
    @Override
    public String toString() {
        return switch (this) {
            case RIGHT -> "Direita";
            case LEFT -> "Esquerda";
            case BETWEEN -> "Ambos";
        };
    }
}
