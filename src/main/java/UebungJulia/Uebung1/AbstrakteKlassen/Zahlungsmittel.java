package UebungJulia.Uebung1.AbstrakteKlassen;

public abstract class Zahlungsmittel {
    public double betrag;

    public Zahlungsmittel(double betrag) {
        this.betrag = betrag;
    }

    abstract void bezahlen();
}
