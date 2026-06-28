package Klausurvorbereitung.AufgabenVorlesung.Interfaces.Zahlungsdienste;

public class Paypal implements IZahlungsdienst{
    @Override
    public boolean authorisiereZahlung(double betrag) {
        return true;
    }

    @Override
    public String durchfuehrenZahlung(double betrag) {
        System.out.println("Transaktionsnummer: PP-392034");
        return "Paypal Zahlung durchgeführt";
    }
}
