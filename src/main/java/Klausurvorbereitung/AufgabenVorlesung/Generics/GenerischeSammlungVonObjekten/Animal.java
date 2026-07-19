package Klausurvorbereitung.AufgabenVorlesung.Generics.GenerischeSammlungVonObjekten;

public abstract class Animal implements Describable {

    @Override
    public String describe() {
        return "";
    }

    abstract String getSound();
}
