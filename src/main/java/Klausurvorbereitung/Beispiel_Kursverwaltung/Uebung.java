package Klausurvorbereitung.Beispiel_Kursverwaltung;

public class Uebung extends Kurseinheit implements Bewertbar{
    private int aufgabenAnzahl;

    public Uebung(String titel, int dauerMinuten, Status status, int aufgabenAnzahl) {
        super(titel, dauerMinuten, status);
        this.aufgabenAnzahl = aufgabenAnzahl;
    }

    @Override
    public int berechnePunkte() {
        return 0;
    }

    @Override
    public void starten() {

    }
}
