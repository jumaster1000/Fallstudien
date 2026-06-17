package Klausurvorbereitung.AufgabenVorlesung.VarAnzahlParameter.Gaesteliste;

import java.util.ArrayList;

public class Party {
    private ArrayList<Guest> guestlist = new ArrayList<>();

    public void inviteGuests(Guest ... guests){
        for(Guest gespeicheterGast : guests){
            if (guestlist.contains(gespeicheterGast.getEmail())){
                System.out.println("Gast bereits registriert");
            } else {
                guestlist.add(gespeicheterGast);
            }
        }
    }

    public static void main(String[] args) {
        Guest g1 = new Guest("Julian", "julian@gmx.de");
        Guest g2 = new Guest("Max", "max@gmx.de");
        Guest g3 = new Guest("Paul", "max@gmx.de");

    }
}
