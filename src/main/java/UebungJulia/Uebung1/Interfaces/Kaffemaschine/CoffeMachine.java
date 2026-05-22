package UebungJulia.Uebung1.Interfaces.Kaffemaschine;

public class CoffeMachine implements CoffeDevice{
    CoffeType selectedCoffe;
    private boolean isOn;
    private boolean selectedCoffeType;

    public CoffeMachine(boolean isOn) {
        this.isOn = isOn;
    }

    @Override
    public void powerOn() {
        isOn = true;
        if (isOn){
            System.out.println("Kaffemaschine ist eingeschaltet.");
        }
    }

    @Override
    public void selectCoffe(CoffeType type) {
        selectedCoffe = type;
        if (isOn) {
            System.out.print("Kaffetyp ausgewählt");
            selectedCoffeType = true;
        } else {
            System.out.println("Bitte Kaffemaschine einschalten");
        }
    }

    @Override
    public void start() {
        System.out.println("Kaffemaschine gestartet:" + selectedCoffe + " Füllmenge: " + selectedCoffe.getFuellmenge() + " ml");
    }
}
