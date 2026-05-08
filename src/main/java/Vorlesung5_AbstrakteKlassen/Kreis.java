package Vorlesung5_AbstrakteKlassen;

public class Kreis extends Form{
    double radius;

    public Kreis(double radius) {
        this.radius = radius;
    }

    @Override
    double berechneFlaeche() {
        return Math.PI * (radius * radius);
    }
}
