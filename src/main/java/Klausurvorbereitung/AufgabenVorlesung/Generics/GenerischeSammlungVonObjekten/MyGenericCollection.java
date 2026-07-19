package Klausurvorbereitung.AufgabenVorlesung.Generics.GenerischeSammlungVonObjekten;

import java.util.ArrayList;

public class MyGenericCollection <T> {
    ArrayList<T> liste = new ArrayList<>();

    public void add(T item){
        liste.add(item);
    }

    public boolean remove(T item){
        liste.remove(item);

        if(liste.contains(item)){
            return false;
        } else {
            return true;
        }
    }

    public T get(int index){
        return liste.get(index);
    }

    public int size(){
        return liste.size();
    }

    public static void main(String[] args) {
        MyGenericCollection<Animal> a1 = new MyGenericCollection<Animal>();
        Animal dog = new Dog();
        Animal cat = new Cat();


        a1.add(dog);
        a1.add(cat);

        for (int i = 0; i < a1.size(); i++) {
            Animal a = a1.get(i);

            System.out.println(a.describe());
            System.out.println(a.getSound());
        }
    }


}
