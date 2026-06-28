package Klausurvorbereitung.AufgabenJulia.EnumUndInterface;

public enum CoffeType {
    ESPRESSO(30), CAPPUCINO(150), LATTE(250);

    private int fuellmenge;

    CoffeType(int fuellmenge) {
        this.fuellmenge = fuellmenge;
    }
}
