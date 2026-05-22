package UebungJulia.Uebung1.Enum;

public class Vehicle {
    private String registrationNumber;
    private String driverName;
    private TrafficLight trafficLightColor;

    public Vehicle(String registrationNumber, String driverName, TrafficLight trafficLightColor) {
        this.registrationNumber = registrationNumber;
        this.driverName = driverName;
        this.trafficLightColor = trafficLightColor;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", driverName='" + driverName + '\'' +
                ", trafficLightColor=" + trafficLightColor + " " +
                trafficLightColor.getMeaning();
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("NU_AB_123", "Müller", TrafficLight.RED);


        for (TrafficLight t : TrafficLight.values()) {
            System.out.println("Traffic light color: " + t + t.getMeaning());
        }
    }
}

