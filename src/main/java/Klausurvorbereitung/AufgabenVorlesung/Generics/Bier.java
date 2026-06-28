package Klausurvorbereitung.AufgabenVorlesung.Generics;

public class Bier <T> implements Comparable{
    private T name;
    private T herkunft;
    private T flascheninhalt;

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Bier{" +
                "name=" + name +
                ", herkunft=" + herkunft +
                ", flascheninhalt=" + flascheninhalt +
                '}';
    }

    public Bier(T name, T herkunft, T flascheninhalt) {
        this.name = name;
        this.herkunft = herkunft;
        this.flascheninhalt = flascheninhalt;
    }


}
