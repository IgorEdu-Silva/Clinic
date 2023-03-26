package DiceClient;

public enum Ciso {
    HIGHER, LOWER, RIGHT, LEFT;

    @Override
    public String toString() {
        return switch (this){
            case HIGHER -> "Superior";
            case LOWER -> "Inferior";
            case RIGHT -> "Direito";
            case LEFT -> "Esquerdo";
        };
    }
}
