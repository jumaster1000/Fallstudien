package Klausurvorbereitung.Beispiel_Lerninhalte;

public abstract class Lerninhalt {
    private String titel;
    private int dauer;
    private Status status;

    public Lerninhalt(String titel, int dauer, Status status) {
        this.titel = titel;
        this.dauer = dauer;
        this.status = status;
    }

    public void anzeigen(){
        System.out.println(titel + " (" + dauer + " Minuten) - " + status);
    }

    public abstract void starten();

    public String getTitel(){
        return titel;
    }

    public int getDauerMinuten(){
        return dauer;
    }
}
