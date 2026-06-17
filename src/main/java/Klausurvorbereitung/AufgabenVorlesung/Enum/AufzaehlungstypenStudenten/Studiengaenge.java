package Klausurvorbereitung.AufgabenVorlesung.Enum.AufzaehlungstypenStudenten;

public enum Studiengaenge {
    DSM(8), DEM(7), Wirtschaftsinformatik(6), SystemsEngineering(5), Betriebswirtschaft(4);

    private final int semester;

    Studiengaenge(int semester) {
        this.semester = semester;
    }
}
