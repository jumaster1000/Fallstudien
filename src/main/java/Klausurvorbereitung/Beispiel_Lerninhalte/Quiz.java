package Klausurvorbereitung.Beispiel_Lerninhalte;

public class Quiz extends Lerninhalt implements Bewertbar{
    private Integer maxPunkte;
    private Integer erreichtePunkte;

    public Quiz(String titel, int dauer, Status status, Integer maxPunkte, Integer erreichtePunkte) {
        super(titel, dauer, status);
        this.maxPunkte = maxPunkte;
        this.erreichtePunkte = erreichtePunkte;
    }

    @Override
    public void starten() {

    }

    @Override
    public int bewerten() {
        return 0;
    }




}
