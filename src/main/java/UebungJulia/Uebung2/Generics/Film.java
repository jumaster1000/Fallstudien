package UebungJulia.Uebung2.Generics;

public class Film implements Comparable<Film>{
    private String titel;
    private String regisseur;
    private int laufzeit;

    public Film(String titel, String regisseur, int laufzeit) {
        this.titel = titel;
        this.regisseur = regisseur;
        this.laufzeit = laufzeit;
    }

    @Override
    public String toString() {
        return "Film{" +
                "titel='" + titel + '\'' +
                ", regisseur='" + regisseur + '\'' +
                ", laufzeit=" + laufzeit +
                '}';
    }

    @Override
    public int compareTo(Film o) {
        return 0;
    }

    public static void main(String[] args) {
        Film f1 = new Film("Titanic", "unknown", 180);
        Film f2 = new Film("Wolf of Wallstreet", "kp", 120);
        Film f3 = new Film("Last Christmas", "..", 90);
        Film f4 = new Film("Star Wars", "unknown", 180);

        Film[] filme = new Film[4];
        filme[0] = f1;
        filme[1] = f2;
        filme[2] = f3;
        filme[3] = f4;

        for(Film film : filme){
            System.out.println(film);
        }
    }
}
