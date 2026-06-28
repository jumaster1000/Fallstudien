package Klausurvorbereitung.AufgabenVorlesung.Interfaces.Zahlungsdienste;

public class Kreditkarte implements IZahlungsdienst{
    @Override
    public boolean authorisiereZahlung(double betrag) {
        if(betrag < 1000){
            return true;
        } else{
            return false;
        }
    }

    @Override
    public String durchfuehrenZahlung(double betrag) {
        return "Kreditkarten Zahlung durchgeführt";
    }
}
