package Klausurvorbereitung.AufgabenJulia.AbstrakteKlassenUndInterfaces.Aufagabe2;

public class Praesentation implements Exportierbar{
    private String name;

    @Override
    public void exportieren(String dateiformat){
        System.out.println("Die Präsentation: " + name + " wird im Format: " + dateiformat + " exportiert.");
    }

    public Praesentation(String name){
        this.name = name;
    }
}
