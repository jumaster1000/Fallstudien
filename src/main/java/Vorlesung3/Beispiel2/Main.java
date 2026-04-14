package Vorlesung3.Beispiel2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.draw();
        circle.getArea();

        rectangle.draw();
        rectangle.getArea();
    }
}
