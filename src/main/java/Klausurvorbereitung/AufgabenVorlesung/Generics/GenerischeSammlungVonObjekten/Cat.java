package Klausurvorbereitung.AufgabenVorlesung.Generics.GenerischeSammlungVonObjekten;

public class Cat extends Animal{
    @Override
    public String describe() {
        return "Ich bin eine Katze";
    }

    @Override
    String getSound() {
        return "miau miau";
    }
}
