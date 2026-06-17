package Klausurvorbereitung.AufgabenVorlesung.VarAnzahlParameter.VariableAnzahlParameter;

public class Berechnungen {
    public static void main(String[] args) {
        int zahlen = multiplizieren(1,3,4,6,7);
        System.out.println(zahlen);
    }

    public static int multiplizieren(int ... numbers){
        int ergebnis = 1;

        for(int n : numbers){
            ergebnis *= n;
        }

        return ergebnis;
    }
}
