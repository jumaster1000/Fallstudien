package Klausurvorbereitung.Beispiel_Lerninhalte;

import java.util.ArrayList;

public class Kurs <T extends Lerninhalt>{
    private String name;
    private ArrayList<T> inhalte;

    public Kurs(String name, ArrayList<T> inhalte) {
        this.name = name;
        this.inhalte = inhalte;
    }

    /*
    public void hinzufuegen(inhalt: T){

    }

    public void entfernen(inhalt: T){

    }

     */

    public void alleAnzeigen(){

    }

    public void alleStarten(){

    }

    public void sortiereNachSatum(){

    }

    /*
    public ArrayList<T> getInhalte(){

    }

     */
}
