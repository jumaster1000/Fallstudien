package Klausurvorbereitung.Beispiel_Kursverwaltung;

public abstract class Kurseinheit {
    private String titel;
    private int dauerMinuten;
    private Status status;

    public Kurseinheit(String titel, int dauerMinuten, Status status) {
        this.titel = titel;
        this.dauerMinuten = dauerMinuten;
        this.status = status;
    }

    public void anzeigen(){

    }

    public abstract void starten();

    public String getTitel(){
        return titel;
    }

    public int getDauerMinuten(){
        return dauerMinuten;
    }

    public Status getStatus(){
        return status;
    }
}

