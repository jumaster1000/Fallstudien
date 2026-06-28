package Klausurvorbereitung.AufgabenVorlesung.Interfaces.GeometrischeFiguren;

public class Dreieck implements IFlaecheninhalt {
    private Number grundseite;
    private Number hoehe;

    @Override
    public double gibFlaecheninhalt() {
        double g = grundseite.doubleValue();
        double h = hoehe.doubleValue();

        return (g * h) * 0.5;
    }

    @Override
    public String toString() {
        return "Dreieck";
    }

    public Dreieck(Number grundseite, Number hoehe){
        this.grundseite = grundseite;
        this.hoehe = hoehe;
    }

    public Number getGrundseite() {
        return grundseite;
    }

    public void setGrundseite(Number grundseite) {
        this.grundseite = grundseite;
    }

    public Number getHoehe() {
        return hoehe;
    }

    public void setHoehe(Number hoehe) {
        this.hoehe = hoehe;
    }
}
