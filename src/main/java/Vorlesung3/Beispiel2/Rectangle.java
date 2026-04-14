package Vorlesung3.Beispiel2;

public class Rectangle implements Shape {
    @Override
    public void draw(){
        System.out.println("Rechteck wird gezeichnet");
    }

    @Override
    public void getArea() {
        double area = 0;
        double a = 3;
        double b = 4;
        area = a * b;
        System.out.println("Der Flächeninhalt ist: " + area);

    }
}
