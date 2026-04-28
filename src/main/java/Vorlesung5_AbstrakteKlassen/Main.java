package Vorlesung5_AbstrakteKlassen;

public class Main{
    public static void main(String[] args) {
        Form[] formen = new Form[] {
                new Rechteck(5,3),
                new Kreis(3)
        };

        for(Form form : formen){
            System.out.println("Fläche: " + form.berechneFlaeche());
        }
    }

}
