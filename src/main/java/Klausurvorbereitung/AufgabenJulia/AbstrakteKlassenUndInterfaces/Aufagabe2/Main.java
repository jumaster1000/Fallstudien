package Klausurvorbereitung.AufgabenJulia.AbstrakteKlassenUndInterfaces.Aufagabe2;

public class Main {
    private String titel;
    private String dateiformat;

    public Main(String titel, String dateiformat){
        this.titel = titel;
        this.dateiformat = dateiformat;
    }

    public static void main(String[] args) {
        WikiPage wikiPage = new WikiPage("Java Grundlagen");
        Praesentation praesentation = new Praesentation("Interfaces");

        wikiPage.exportieren("PDF");
        praesentation.exportieren("PPTX");

    }
}
