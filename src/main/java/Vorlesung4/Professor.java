package Vorlesung4;

public class Professor extends Hochschulangehoeriger{
    @Override
    public boolean gleich() {
        return super.gleich();
    }

    @Override
    public boolean groesser() {
        return super.groesser();
    }

    @Override
    public boolean kleiner() {
        return super.kleiner();
    }

    private int persnr;

    public boolean gibBrutto(){
        return false;
    }
}
