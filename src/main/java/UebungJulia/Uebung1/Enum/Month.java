package UebungJulia.Uebung1.Enum;

public enum Month {
    JANUAR(31),
    FEBRUAR(28),
    MAERZ(31),
    APRIL(30),
    MAI(31),
    JUNI(30),
    JULI(31),
    AUGUST(31),
    SEPTEMBER(30),
    OKTOBER(31),
    NOVEMBER(30),
    DEZEMBER(31);

    private final int days;

    Month(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public static void main(String[] args) {
        for(Month m : Month.values()){
            System.out.println("The Month " + m + " has " + m.getDays() + " days");
        }
    }
}
