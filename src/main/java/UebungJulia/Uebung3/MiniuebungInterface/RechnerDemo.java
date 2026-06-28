package UebungJulia.Uebung3.MiniuebungInterface;

import java.util.function.Function;

public class RechnerDemo{

    public static void main(String[] args) {
        Rechnung addition = ((a, b) -> a+b);
        Rechnung multiplikation = ((a, b) -> a*b);

        System.out.println("Addition: " + addition.berechne(2,3));
        System.out.println("Multiplikation: " + multiplikation.berechne(4,5));

    }
}
