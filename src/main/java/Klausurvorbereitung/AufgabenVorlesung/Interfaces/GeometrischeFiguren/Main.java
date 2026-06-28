package Klausurvorbereitung.AufgabenVorlesung.Interfaces.GeometrischeFiguren;

public class Main{
    public static void main(String[] args) {
        Quadrat quadrat1 = new Quadrat(3);
        Quadrat quadrat2 = new Quadrat(4.5);
        Rechteck rechteck1 = new Rechteck(3,4);
        Rechteck rechteck2 = new Rechteck(5.2,8.6);
        Dreieck dreieck1 = new Dreieck(3,4);
        Dreieck dreieck2 = new Dreieck(6.6,2.9);
        Kreis kreis1 = new Kreis(3);
        Kreis kreis2 = new Kreis(5.6);

        IFlaecheninhalt[] formen  = {quadrat1, quadrat2, rechteck1, rechteck2, dreieck1, dreieck2, kreis1, kreis2};

        for(IFlaecheninhalt f : formen){
            System.out.println("Der Flächeninhalt von " + f.toString() + " beträgt " + f.gibFlaecheninhalt());
        }
    }

}
