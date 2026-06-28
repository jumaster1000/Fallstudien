package Klausurvorbereitung.AufgabenJulia.AbstrakteKlassenUndInterfaces.Aufagabe2;

public class WikiPage implements Exportierbar{
    private String titel;

    @Override
    public void exportieren(String dateiformat){
        System.out.println("Die WikiPage: " + titel + " wird im Format: " + dateiformat + " exportiert.");
    }

    public WikiPage(String titel){
        this.titel = titel;
    }
}
