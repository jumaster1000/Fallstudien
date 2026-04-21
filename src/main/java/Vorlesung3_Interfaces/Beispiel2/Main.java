package Vorlesung3_Interfaces.Beispiel2;

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
