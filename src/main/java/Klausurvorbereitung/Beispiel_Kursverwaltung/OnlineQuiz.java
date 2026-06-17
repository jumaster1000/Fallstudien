package Klausurvorbereitung.Beispiel_Kursverwaltung;

public class OnlineQuiz extends Kurseinheit implements Bewertbar{
    private int fragenAnzahl;
    private int fragenProAufgabe;

    public OnlineQuiz(String titel, int dauerMinuten, Status status, int fragenAnzahl, int fragenProAufgabe) {
        super(titel, dauerMinuten, status);
        this.fragenAnzahl = fragenAnzahl;
        this.fragenProAufgabe = fragenProAufgabe;
    }

    @Override
    public int berechnePunkte() {
        return 0;
    }

    @Override
    public void starten() {

    }
}
