package Klausurvorbereitung.AufgabenVorlesung.Interfaces.Zahlungsdienste;

public class Bitcoin implements IZahlungsdienst{
    @Override
    public boolean authorisiereZahlung(double betrag) {
        betrag = betrag * 0.00002;
        if(betrag < 0.01){
            return true;
        } else{
            return false;
        }

    }

    @Override
    public String durchfuehrenZahlung(double betrag) {
        return "Bitcoin Zahlung durchgeführt";
    }
}
