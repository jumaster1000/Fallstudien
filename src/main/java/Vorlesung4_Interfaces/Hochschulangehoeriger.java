package Vorlesung4_Interfaces;

public class Hochschulangehoeriger extends Person implements ISortierbar{
    @Override
    public boolean gleich(Object obj) {
        return false;
    }

    @Override
    public boolean groesser(Object obj) {
        return false;
    }

    @Override
    public boolean kleiner(Object obj) {
        return false;
    }
    protected String hochschule;





}
