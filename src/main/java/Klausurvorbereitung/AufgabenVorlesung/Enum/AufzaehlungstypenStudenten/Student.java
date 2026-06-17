package Klausurvorbereitung.AufgabenVorlesung.Enum.AufzaehlungstypenStudenten;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String vorname;
    private int matrikelnummer;
    private Studiengaenge studiengaenge;

    public Student(String name, String vorname, int matrikelnummer, Studiengaenge studiengaenge) {
        this.name = name;
        this.vorname = vorname;
        this.matrikelnummer = matrikelnummer;
        this.studiengaenge = studiengaenge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", vorname='" + vorname + '\'' +
                ", matrikelnummer=" + matrikelnummer +
                ", studiengaenge=" + studiengaenge +
                '}';
    }

    public static void main(String[] args) {
        Student s1 = new Student("Mustermann", "Max", 362748, Studiengaenge.DEM);
        Student s2 = new Student("Mustermann", "Max", 362748, Studiengaenge.DEM);
        Student s3 = new Student("Mustermann", "Max", 362748, Studiengaenge.DEM);
        Student s4 = new Student("Mustermann", "Max", 362748, Studiengaenge.DEM);
        Student s5 = new Student("Mustermann", "Max", 362748, Studiengaenge.DEM);
        Student s6 = new Student("Mustermann", "Max", 362748, Studiengaenge.DEM);
        Student s7 = new Student("Mustermann", "Max", 362748, Studiengaenge.DEM);
        Student s8 = new Student("Mustermann", "Max", 362748, Studiengaenge.DEM);
        Student s9 = new Student("Mustermann", "Max", 362748, Studiengaenge.DEM);
        Student s10 = new Student("Mustermann", "Max", 362748, Studiengaenge.DEM);

        Student[] studenten = {s1, s2, s3, s4, s5, s6, s7, s8, s9, s10};

        for(Student s : studenten){
            System.out.println(s);;
        }

    }
}
