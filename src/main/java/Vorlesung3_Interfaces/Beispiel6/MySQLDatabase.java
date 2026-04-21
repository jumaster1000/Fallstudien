package Vorlesung3_Interfaces.Beispiel6;

public class MySQLDatabase implements Datenbankverbindung{
    @Override
    public void connect() {
        System.out.println("Datenbank ist verbunden!");
    }

    @Override
    public void disconnect() {
        System.out.println("Verbindung zur Datenbank wurde unterbrochen!");
    }

    @Override
    public void insert() {
        System.out.println("Insert!");
    }

    @Override
    public void update() {
        System.out.println("Update!");
    }
}
