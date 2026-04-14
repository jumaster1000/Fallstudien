package Vorlesung3.Beispiel1;

public class Car implements Vehicle {
    @Override
    public void startEngine(){
        System.out.println("Start");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop");

    }
}
