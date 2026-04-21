package Vorlesung4_Interfaces;

public class Professor extends Hochschulangehoeriger{
    @Override
    public boolean gleich(Object obj) {
        return super.gleich(obj);
    }

    @Override
    public boolean groesser(Object obj) {
        return super.groesser(obj);
    }

    @Override
    public boolean kleiner(Object obj) {
        return super.kleiner(obj);
    }

    private int persnr;

    public int gibBruttoGehalt(){
        return 0;
    }
}
