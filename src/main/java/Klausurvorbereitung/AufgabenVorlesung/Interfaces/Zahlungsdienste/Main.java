package Klausurvorbereitung.AufgabenVorlesung.Interfaces.Zahlungsdienste;

public class Main{
    public static void main(String[] args) {
        IZahlungsdienst betrag1 = new Kreditkarte();
        IZahlungsdienst betrag2 = new Paypal();
        IZahlungsdienst betrag3 = new Bitcoin();

        if (betrag1.authorisiereZahlung(1000)){
            System.out.println(betrag1.durchfuehrenZahlung(1000));
        } else {
            System.out.println("Betrag ist zu hoch (Kreditkarte)");
        }

        if (betrag2.authorisiereZahlung(200)){
            System.out.println(betrag2.durchfuehrenZahlung(200));
        } else {
            System.out.println("Betrag ist zu hoch ");
        }

        if (betrag3.authorisiereZahlung(50000)){
            System.out.println(betrag3.durchfuehrenZahlung(50000));
        } else {
            System.out.println("Betrag ist zu hoch");
        }







    }
}
