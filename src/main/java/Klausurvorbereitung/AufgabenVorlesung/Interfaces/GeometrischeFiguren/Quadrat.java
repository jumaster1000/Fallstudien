package Klausurvorbereitung.AufgabenVorlesung.Interfaces.GeometrischeFiguren;

public class Quadrat implements IFlaecheninhalt {
    private Number seite;

    @Override
    public double gibFlaecheninhalt() {
        double s = seite.doubleValue();
        return s * s;
    }

    @Override
    public String toString() {
        return "Quadrat";
    }

    public Quadrat(Number seite){
        this.seite = seite;
    }

    public Number getSeite() {
        return seite;
    }

    public void setSeite(Number seite) {
        this.seite = seite;
    }
}
