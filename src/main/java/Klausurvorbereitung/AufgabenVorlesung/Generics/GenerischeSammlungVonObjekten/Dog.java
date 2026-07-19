package Klausurvorbereitung.AufgabenVorlesung.Generics.GenerischeSammlungVonObjekten;

public class Dog extends Animal{
    @Override
    public String describe() {
        return "Ich bin ein Hund";
    }

    @Override
    String getSound() {
        return "wau wau";
    }


}
