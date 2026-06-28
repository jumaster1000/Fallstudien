package Klausurvorbereitung.AufgabenVorlesung.Interfaces.Zahlungsdienste;

public interface IZahlungsdienst {
    boolean authorisiereZahlung(double betrag);
    String durchfuehrenZahlung(double betrag);
}
