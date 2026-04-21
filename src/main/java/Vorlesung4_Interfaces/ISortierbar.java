package Vorlesung4_Interfaces;

public interface ISortierbar extends IGroesser, IKleiner, IGleich{
    @Override
    boolean gleich(Object obj);

    @Override
    boolean groesser(Object obj);

    @Override
    boolean kleiner(Object obj);
}
