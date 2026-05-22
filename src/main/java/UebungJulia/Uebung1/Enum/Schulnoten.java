package UebungJulia.Uebung1.Enum;

public enum Schulnoten {
    SEHR_GUT(1), GUT(2), BEFRIEDIGEND(3), AUSREICHEND(4), MANGELHAFT(5), UNGENUEGEND(6);

    private final int note;

    Schulnoten(int noten) {
        this.note = noten;
    }

    public int getBewertung() {
        return note;
    }

    boolean istBestanden(){
        return note < 5;
    }

    public static void main(String[] args) {
        for(Schulnoten n : Schulnoten.values()){
            System.out.println("Note: " + n + " - Bestanden: " + n.istBestanden());
        }
    }

}
