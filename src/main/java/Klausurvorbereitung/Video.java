package Klausurvorbereitung;

public class Video extends Lerninhalt{
    public Video(String titel, int dauer, Status status) {
        super(titel, dauer, status);
    }

    @Override
    public void anzeigen() {
        super.anzeigen();
    }

    @Override
    public String getTitel() {
        return super.getTitel();
    }

    @Override
    public int getDauerMinuten() {
        return super.getDauerMinuten();
    }

    private String url;

    public Video(String titel, int dauer, Status status, String url) {
        super(titel, dauer, status);
        this.url = url;
    }

    @Override
    public void starten() {

    }

    public void abspiele(){

    }

}
