package Vorlesung3.Beispiel6;

public class Main {
    public static void main(String[] args) {
        MySQLDatabase database = new MySQLDatabase();
        database.connect();
        database.disconnect();
        database.insert();
        database.update();
    }
}
