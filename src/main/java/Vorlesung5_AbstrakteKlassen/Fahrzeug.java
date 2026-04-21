package Vorlesung5_AbstrakteKlassen;

abstract class Fahrzeug {
    String marke;

    public Fahrzeug(String marke) {
        this.marke = marke;
    }

    abstract void beschleunigen(int wert);

    void zeigeMarke(){
        System.out.println(marke);
    }
}
