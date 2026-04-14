package Vorlesung3.Beispiel2;

public class Circle implements Shape{
    @Override
    public void draw(){
        System.out.println("Kreis wird gezeichnet");
    }

    @Override
    public void getArea() {
        double area = 0;
        double r = 6;
        area = Math.PI * (r*r);
        System.out.println("Der Flächeninhalt ist: " + area);
    }
}
