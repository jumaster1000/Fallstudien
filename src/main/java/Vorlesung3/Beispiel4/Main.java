package Vorlesung3.Beispiel4;

public class Main implements Vehicle {
    public void getVehicleType(){

    }

    public static void main(String[] args) {
        String vehicleType = Vehicle.getVehicleType("PKW");
        System.out.println("Fahrzeugtyp: " + vehicleType);
    }
}
