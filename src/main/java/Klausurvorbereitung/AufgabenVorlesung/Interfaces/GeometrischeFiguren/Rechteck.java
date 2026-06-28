package Klausurvorbereitung.AufgabenVorlesung.Interfaces.GeometrischeFiguren;

public class Rechteck implements IFlaecheninhalt {
    private Number breite;
    private Number hoehe;

    @Override
    public double gibFlaecheninhalt() {
        double b = breite.doubleValue();
        double h = hoehe.doubleValue();
        return b * h;
    }

    @Override
    public String toString() {
        return "Rechteck";
    }

    public Rechteck(Number breite, Number hoehe) {
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public Number getBreite() {
        return breite;
    }

    public void setBreite(Number breite) {
        this.breite = breite;
    }

    public Number getHoehe() {
        return hoehe;
    }

    public void setHoehe(Number hoehe) {
        this.hoehe = hoehe;
    }
}
