package UebungJulia.Uebung2.Generics;

public class Drucker <T>{
    public void drucken(T wert){
        System.out.println(wert);
    }

    public static void main(String[] args) {
        Drucker<String> h = new Drucker<>();
        Drucker<String> t = new Drucker<>();

        h.drucken("Hallo welt");
        t.drucken("Tschüss Welt");
    }
}
