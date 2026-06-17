package Klausurvorbereitung.Beispiel_Kursverwaltung;

public class Vorlesung extends Kurseinheit{
    private String dozent;

    public Vorlesung(String titel, int dauerMinuten, Status status, String dozent) {
        super(titel, dauerMinuten, status);
        this.dozent = dozent;
    }

    @Override
    public void starten(){

    }
}
