package Vorlesung3_Interfaces.Beispiel1;

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
