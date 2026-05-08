package UebungJulia.Uebung1;

public enum TrafficLight {
    RED("Stop"), YELLOW("Caution"), GREEN("Drive");

    public final String meaning;

    TrafficLight(String meaning) {
        this.meaning = meaning;
    }

    public String getMeaning() {
        return meaning;
    }
}
