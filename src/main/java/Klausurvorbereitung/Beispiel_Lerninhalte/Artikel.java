package Klausurvorbereitung.Beispiel_Lerninhalte;

public class Artikel extends Lerninhalt implements Druckbar{
    private int seitenzahl;
    private String autor;

    public Artikel(String titel, int dauer, Status status, int seitenzahl, String autor) {
        super(titel, dauer, status);
        this.seitenzahl = seitenzahl;
        this.autor = autor;
    }

    @Override
    public void starten() {

    }

    @Override
    public void drucken() {

    }
}
