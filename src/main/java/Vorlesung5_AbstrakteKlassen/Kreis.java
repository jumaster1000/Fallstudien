package Vorlesung5_AbstrakteKlassen;

public class Kreis extends Form{
    double radius;

    public Kreis(double redius) {
        this.radius = redius;
    }

    @Override
    double berechneFlaeche() {
        return Math.PI * (radius * radius);
    }
}
