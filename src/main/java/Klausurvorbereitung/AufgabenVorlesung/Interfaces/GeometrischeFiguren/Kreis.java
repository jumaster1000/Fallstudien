package Klausurvorbereitung.AufgabenVorlesung.Interfaces.GeometrischeFiguren;

public class Kreis implements IFlaecheninhalt{
    private Number radius;

    @Override
    public double gibFlaecheninhalt() {
        double r = radius.doubleValue();

        return (r * r) * Math.PI;
    }

    @Override
    public String toString() {
        return "Kreis";
    }

    public Kreis(Number radius){
        this.radius = radius;
    }

    public Number getRadius() {
        return radius;
    }

    public void setRadius(Number radius) {
        this.radius = radius;
    }
}
