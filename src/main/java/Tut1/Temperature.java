package Tut1;

public enum Temperature {
    COLD(20), Warm(40), HOT(60);

    private final int degrees;

    Temperature(int degrees) {
        this.degrees = degrees;
    }
}
