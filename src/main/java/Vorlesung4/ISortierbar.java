package Vorlesung4;

public interface ISortierbar extends IGroesser, IKleiner, IGleich{
    @Override
    boolean gleich();

    @Override
    boolean groesser();

    @Override
    boolean kleiner();
}
