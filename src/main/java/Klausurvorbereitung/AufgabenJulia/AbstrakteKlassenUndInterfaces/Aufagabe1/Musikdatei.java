package Klausurvorbereitung.AufgabenJulia.AbstrakteKlassenUndInterfaces.Aufagabe1;

public class Musikdatei extends Medium{
    private String titel;

    public Musikdatei(String titel, String titel1) {
        super(titel);
        this.titel = titel1;
    }

    @Override
    public void abspielen() {
        super.abspielen();
    }

    @Override
    public String toString() {
        return "Musikdatei{" +
                "titel='" + titel + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Musikdatei musikdatei = new Musikdatei("Das ist der Titel", "Das ist der Titel1");

        System.out.println(musikdatei);
    }

}
