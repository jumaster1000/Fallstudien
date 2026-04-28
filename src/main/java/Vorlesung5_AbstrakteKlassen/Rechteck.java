package Vorlesung5_AbstrakteKlassen;

public class Rechteck extends Form{
    double laenge, breite;

    public Rechteck(double laenge, double breite) {
        this.laenge = laenge;
        this.breite = breite;
    }

    @Override
    double berechneFlaeche() {
        return laenge * breite;
    }
}
