package UebungJulia.Uebung1.Interfaces.Kaffemaschine;

public enum CoffeType {ESPRESSO(30), CAPPUCCINO(150), LATTE(250);

    private final int fuellmenge;

    CoffeType(int fuellmenge) {
        this.fuellmenge = fuellmenge;
    }

    public int getFuellmenge() {
        return fuellmenge;
    }
}
