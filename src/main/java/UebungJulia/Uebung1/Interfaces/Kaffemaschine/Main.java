package UebungJulia.Uebung1.Interfaces.Kaffemaschine;

public class Main {
    public static void main(String[] args) {
        CoffeDevice coffeDevice = new CoffeMachine(false);

        coffeDevice.powerOn();
        coffeDevice.selectCoffe(CoffeType.CAPPUCCINO);
        coffeDevice.start();

    }
}
