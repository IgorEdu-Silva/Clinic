package DiceClient;

public enum Body {
    LEGLEFT, LEGRIGHT, ARMLEFT, ARMRIGHT;

    @Override
    public String toString() {
        return switch (this){
            case LEGLEFT -> "Esquerda";
            case LEGRIGHT -> "Direita";
            case ARMLEFT -> "Esquerdo";
            case ARMRIGHT -> "Direito";
        };
    }
}
