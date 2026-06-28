package Klausurvorbereitung.AufgabenVorlesung.Interfaces.InterfacesUndVerschluesselung;

import java.util.Scanner;

public class CeasarChiffre implements IVerschluesselung {
    private int verschiebung;

    @Override
    public String chiffrieren(String nachricht) {

        return "";
    }

    @Override
    public String dechiffrieren(String nachricht) {

        return "";
    }

    public CeasarChiffre(int verschiebung) {
        this.verschiebung = verschiebung;
    }

    public static void main(String[] args) {
        CeasarChiffre c1 = new CeasarChiffre(3);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Wort zur Verschlüsselung eingeben:");
        String eingabe = scanner.nextLine();
    }


}
