package Vorlesung3.Beispiel4;

public interface Vehicle {
    static String getVehicleType(String vehicle){
       switch(vehicle){
           case "PKW":
               return "Personenkraftwagen";
           case "LKW", "Truck":
               return "Lastkraftswagen";
           case "Bike":
               return "Motorrad";
           case "Bus":
               return "Autobus";
           default:
               return "Fahrzeug";
       }
    }
}
