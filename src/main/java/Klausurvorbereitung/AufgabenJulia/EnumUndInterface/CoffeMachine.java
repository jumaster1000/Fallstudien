package Klausurvorbereitung.AufgabenJulia.EnumUndInterface;

public class CoffeMachine implements CoffeDevice {
    private CoffeType kaffetyp;
    private boolean isOn;
    private int fuellmenge;

    @Override
    public void powerOn() {
        isOn = true;
    }

    @Override
    public void selectCoffe(CoffeType type) {
        switch (kaffetyp){
            case ESPRESSO -> kaffetyp = CoffeType.ESPRESSO;
            case CAPPUCINO -> kaffetyp = CoffeType.CAPPUCINO;
            case LATTE -> kaffetyp = CoffeType.LATTE;
        }
    }

    @Override
    public void start() {
        if(isOn) {
            System.out.println("Ausgewählter Kaffetyp: " + kaffetyp);
            System.out.println("Die aktuelle Füllmenge beträgt: " + fuellmenge);
            isOn = false;
        } else {
            System.out.println("Kaffemaschine ist ausgeschaltet");
        }
    }

    public CoffeMachine(CoffeType kaffetyp, boolean isOn, int fuellmenge) {
        this.kaffetyp = kaffetyp;
        this.isOn = isOn;
        this.fuellmenge = fuellmenge;
    }

    public static void main(String[] args) {
        CoffeMachine coffeMachine = new CoffeMachine(CoffeType.CAPPUCINO, false, 200);
        coffeMachine.powerOn();
        coffeMachine.start();

    }
}
