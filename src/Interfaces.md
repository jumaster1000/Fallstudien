# Lab: Interfaces in Java

In diesem Lab lernen Sie, wie Sie **Interfaces** in Java nutzen können, um Ihre Programme flexibler und modularer zu gestalten. Wir werden das Konzept mit Beispielen und Miniübungen Schritt für Schritt erarbeiten. Ich empfehle Ihnen, die Beispiele selbst auszuprobieren und die Miniübungen zu lösen, um Ihr Verständnis zu vertiefen. Debuggen Sie gerne auch den Beispielcode, um zu sehen, wie er funktioniert und was passiert, wenn Sie ihn ändern. Die geschätzte Bearbeitungszeit beträgt ca. 90 Minuten. Viel Erfolg!

## Lernziele
Nach Bearbeitung dieses Labs sollten Sie in der Lage sein:
- Ein Interface in Java zu definieren und zu implementieren.
- Die Vorteile von Interfaces zu erklären.
- Polymorphismus durch Interfaces zu nutzen.
- Default- und statische Methoden in Interfaces zu verwenden.
- Bestehende Interfaces zu erweitern, um neue Funktionalitäten hinzuzufügen.
- Interfaces in der Praxis einzusetzen.
- Interfaces in der Praxis einzusetzen, z.B. für Datenbankverbindungen.

## Einführung
Eine Schnittstelle ist ein Referenztyp. Es können vom Schnittstellentyp Referenzvariablen gebildet werden, die auf Objekte zeigen, deren Klassen die Schnittstelle implementieren.

Sollen mehrere Klassen die gleichen Signaturen für Methoden implementieren, d.h. Methoden eines bestimmten Aufbaus besitzen, kann das durch ein Interface angegeben werden:

### Syntaxregel:
```java
public interface «INTERFACENAME» {
    // Hier Beschreibung des Interfaces
}
```

Sollen Klassen ein Interface anbieten, so wird dies durch das Schlüsselwort `implements` angegeben:

```java
public class «KLASSENNAME» implements «INTERFACENAME» {
    // Hier Klasseninhalt
}
```

- **Implementiert eine Klasse ein Interface, so muss sie alle Methoden, die das Interface beschreibt, anbieten und implementieren.**
- **Da eine Schnittstelle nur die Signatur von Methoden beschreibt, aber nicht die Implementierung, muss der Entwickler darauf achten, dass die implementierende Klasse die richtige Funktionalität implementiert.**
> ⚠️ **Wichtig:** Ein Interface ist eine Art Vertrag, welcher mit den implementierenden Klassen geschlossen wird.

### Warum braucht man Interfaces?

Interfaces helfen, klare Verträge zwischen Klassen zu definieren, ohne konkrete Details vorzugeben. Sie fördern eine saubere Trennung von Konzepten und erlauben es, flexibel und modular zu programmieren.

Denn soll eine Klasse auf einer Ebene von mehreren Typen erben, geht das durch die Einfachvererbung in Java nicht (in anderen Programmiersprachen hingegen schon!). Da es aber möglich sein soll, dass in der objektorientierten Modellierung eine Klasse mehrere Typen in einem Schritt besitzt, gibt es das Konzept der Schnittstelle (engl. interface). Eine Klasse kann dann neben der Oberklasse eine beliebige Anzahl Schnittstellen implementieren und auf diese Weise weitere Typen "sammeln".

Obwohl Schnittstellen auf den ersten Blick nichts »bringen« – Programmierer wollen gerne etwas vererbt bekommen, damit sie Implementierungsarbeit sparen können –, sind sie eine enorm wichtige Erfindung, da sich über Schnittstellen **ganz unterschiedliche Sichten auf ein Objekt beschreiben lassen**. Jede Schnittstelle ermöglicht eine neue Sicht auf das Objekt, eine Art Rolle. Implementiert eine Klasse diverse Schnittstellen, können ihre Exemplare in verschiedenen Rollen auftreten. Hier wird erneut das Substitutionsprinzip wichtig, bei dem ein mächtigeres Objekt verwendet wird, obwohl je nach Kontext nur die Methode der Schnittstellen erwartet wird.

Eine Schnittstelle darf keinen Konstruktor deklarieren. Das ist auch klar, da Exemplare von Schnittstellen nicht erzeugt werden können, sondern nur von den konkreten implementierenden Klassen.

**Ein Beispiel aus dem echten Leben:**
Stellen Sie sich vor, Sie möchten ein Gerät laden. Egal ob Handy, Laptop oder Tablet – solange das Gerät eine Ladebuchse (Interface) bietet, können Sie jedes Ladegerät anschließen. Wie genau das Gerät intern den Strom verarbeitet, spielt für das Ladegerät keine Rolle. Dies entspricht der Funktion eines Interfaces.

### Vorteile von Interfaces:
1. **Ermöglichen Polymorphismus:**
   Polymorphismus ist Ihnen aus dem 1. Semester bekannt. Es beschreibt die Fähigkeit, dass Objekte unterschiedlicher Klassen auf die gleiche Weise verwendet werden können, solange sie eine gemeinsame Schnittstelle haben. Dies erleichtert die Wiederverwendbarkeit und Austauschbarkeit von Komponenten. Falls Sie es nicht mehr kennen, lesen Sie bitte hier nach (https://de.wikipedia.org/wiki/Polymorphie_(Programmierung)).
2. **Fördern lose Kopplung:**
   Komponenten können unabhängig voneinander entwickelt und ausgetauscht werden, solange sie dasselbe Interface verwenden.
3. **Ermöglichen Mehrfachvererbung:**
   Da Java nur Einfachvererbung bei Klassen erlaubt, bieten Interfaces eine Möglichkeit, mehrere Verhaltensweisen zu erben.
4. **Erleichtern das Testen:**
   Durch Interfaces können Mock-Objekte erstellt werden, um Klassen zu testen, ohne von der tatsächlichen Implementierung abhängig zu sein, die vielleicht noch nicht fertig ist. Stellen Sie sich vor, Sie entwickeln eine Klasse, die auf eine Datenbank zugreift. Um die Klasse zu testen, können Sie ein Mock-Objekt erstellen, das das Interface der Datenbank implementiert, aber nur Dummy-Daten zurückgibt. So können Sie die Klasse testen, ohne auf die tatsächliche Datenbank zugreifen zu müssen.
5. **Unterstützen Erweiterbarkeit:**
   Neue Funktionalität kann durch zusätzliche Interfaces hinzugefügt werden, ohne bestehende Klassen zu ändern.

## Was macht @Override?

Das `@Override`-Annotation in Java wird verwendet, um anzugeben, dass eine Methode aus einer Oberklasse oder einem Interface in einer Unterklasse oder implementierenden Klasse überschrieben wird. Es dient als Hinweis für den Compiler und für den Leser des Codes.

### Vorteile von @Override:
1. **Verhindert Fehler:** Der Compiler überprüft, ob die Methode tatsächlich überschrieben wird. Falls ein Fehler in der Signatur (z. B. falscher Methodenname oder falsche Parameter) vorliegt, wird dies frühzeitig erkannt.
2. **Verbessert Lesbarkeit:** Es wird für andere Entwickler klarer, dass die Methode eine überschreibende Implementierung darstellt.

### Beispiel:
```java
interface Animal {
    void eat();
}

class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Der Hund frisst.");
    }
}
```
### Erklärung:
1. Die Methode `eat` in der Klasse `Dog` implementiert die abstrakte Methode `eat` aus dem Interface `Animal`.
2. Das `@Override`-Annotation gibt an, dass die Methode aus dem Interface überschreibt.
3. Falls der Methodenname oder die Signatur nicht mit der Definition im Interface übereinstimmt, wird ein Fehler angezeigt.

### Miniübungen:
- Erstellen Sie ein Interface `Appliance` mit einer Methode `turnOn`.
- Implementieren Sie es in einer Klasse `Fan` und überschreiben Sie die Methode mit dem `@Override`-Annotation.
- Was passiert wenn Sie die @Override-Annotation entfernen?
- Was passiert wenn Sie die Methode `turnOn` in der Klasse `Fan` umbenennen? Können Sie sich das erklären? 

<details>
<summary>Antworten - bitte erst selbst versuchen bevor Sie sich dies ansehen</summary>

```java
interface Appliance {
    void turnOn();
}

class Fan implements Appliance {
    @Override
    public void turnOn() {
        System.out.println("Der Ventilator wird eingeschaltet.");
    }
}
```
Wenn Sie die @Override-Annotation entfernen, wird der Code immer noch funktionieren.
Wenn Sie die Methode `turnOn` in der Klasse `Fan` umbenennen, wird ein Fehler angezeigt, da die Methode nicht mehr das Interface überschreibt. Die `@Override`-Annotation hilft, solche Fehler zu vermeiden. 
</details>

## Beispiel 1: Ein einfaches Interface
```java
interface Animal {
    void eat();
    void sleep();
}

class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Der Hund frisst.");
    }

    @Override
    public void sleep() {
        System.out.println("Der Hund schläft.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
        dog.sleep();
    }
}
```
### Erklärung:
1. Das `Animal`-Interface definiert zwei Methoden: `eat` und `sleep`. Diese Methoden sind abstrakt, das bedeutet, sie haben keinen Körper und müssen in jeder Klasse, die das Interface implementiert, konkret definiert werden.
2. Die Klasse `Dog` implementiert das Interface und gibt die konkrete Umsetzung der Methoden an. So wird festgelegt, wie ein Hund "essen" und "schlafen" soll.
3. Im `Main`-Programm wird eine Referenzvariable vom Typ `Animal` verwendet, die auf ein `Dog`-Objekt zeigt. Dadurch können Sie mit `dog.eat()` und `dog.sleep()` die Methoden der Implementierung aufrufen.

### Miniübungen:
- Erstellen Sie ein Interface `Vehicle` mit den Methoden `startEngine` und `stopEngine`.
- Implementieren Sie dieses Interface in einer Klasse `Car`.
- Schreiben Sie eine `Main`-Klasse, um die Methoden zu testen.

<details>
<summary>Antworten - bitte erst selbst versuchen bevor Sie sich dies ansehen</summary>

```java
interface Vehicle {
    void startEngine();
    void stopEngine();
}

class Car implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Der Motor des Autos wird gestartet.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Der Motor des Autos wird gestoppt.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.startEngine();
        car.stopEngine();
    }
}
```
</details>


## Beispiel 2: Interfaces und Polymorphismus
Ein Interface ermöglicht es, polymorphe Programme zu schreiben, da mehrere Klassen ein gemeinsames Interface implementieren können.

```java
interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Kreis wird gezeichnet.");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rechteck wird gezeichnet.");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape circle2 = new Circle();
        Shape circle3 = new Circle();
        Shape rectangle = new Rectangle();
        Shape rectangle2 = new Rectangle();

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(circle2);
        shapes.add(circle3);
        shapes.add(rectangle);
        shapes.add(rectangle2);
        
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
```
### Erklärung:
1. Das Interface `Shape` definiert die Methode `draw`. Jede Klasse, die das Interface implementiert, muss die Methode `draw` auf ihre Weise implementieren.
2. Die Klasse `Circle` implementiert die Methode so, dass sie eine Nachricht ausgibt, die besagt, dass ein Kreis gezeichnet wird. Ähnlich gibt `Rectangle` an, dass ein Rechteck gezeichnet wird.
3. Im `Main`-Programm wird Polymorphismus verwendet. Eine Referenzvariable vom Typ `Shape` zeigt entweder auf ein `Circle`- oder ein `Rectangle`-Objekt. Der konkrete Typ bestimmt, welche Implementierung der `draw`-Methode ausgeführt wird. Da jedoch alle Klassen das `Shape`-Interface implementieren, können sie in einer Liste von `Shape`-Objekten gespeichert und gemeinsam verarbeitet werden. Ebenso kann die Methode `draw` aufgerufen werden, ohne den konkreten Typ zu kennen. Das wird über die Referenzvariable `shape` realisiert, die vom Typ `Shape` und damit vom Typ des Interfaces ist.

Polymorphismus bedeutet, dass Sie eine gemeinsame Schnittstelle nutzen können, um unterschiedliche Implementierungen auszuwählen, ohne den Code ändern zu müssen.

### Miniübung:
- Ergänzen Sie das `Shape`-Interface mit der Methode `getArea`.
- Implementieren Sie die Methode in `Circle` (Berechnung: π * r²) und `Rectangle` (Berechnung: Länge * Breite).
- Testen Sie Ihre Implementierungen. Sie müssen keine Liste verwenden, sondern können die Objekte direkt erstellen und die Methoden aufrufen. Falls Sie es zu Übungszwecken jedoch tun möchten, sehr gern.

<details>
<summary>Antworten - bitte erst selbst versuchen bevor Sie sich dies ansehen</summary>

```java
interface Shape {
    void draw();
    double getArea();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Kreis wird gezeichnet.");
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Rechteck wird gezeichnet.");
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 3);

        System.out.println("Kreisfläche: " + circle.getArea());
        System.out.println("Rechteckfläche: " + rectangle.getArea());
    }
}
```
</details>

## Beispiel 3: Default-Methoden in Interfaces
Ab Java 8 können Interfaces Standardmethoden enthalten, die eine Implementierung bereitstellen. Das ermöglicht es, neue Methoden zu einem bestehenden Interface hinzuzufügen, ohne alle implementierenden Klassen ändern zu müssen. Jedoch wird damit das bis vor Java 8 relativ strikte Konzept der Interfaces aufgeweicht, da Interfaces nun auch Methoden mit einer Implementierung enthalten können. 

```java
interface Printer {
    void print(String message);

    default void printWelcome() {
        System.out.println("Willkommen beim Printer Interface!");
    }
}

class ConsolePrinter implements Printer {
    @Override
    public void print(String message) {
       System.out.println("Time: " + System.currentTimeMillis() + " - " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        Printer printer = new ConsolePrinter();
        printer.printWelcome();
        printer.print("Das ist eine benutzerdefinierte Nachricht.");
    }
}
```
### Erklärung:
1. Eine Default-Methode in einem Interface hat bereits eine Implementierung. In diesem Beispiel bietet die Methode `printWelcome` eine Standardnachricht.
2. Die Klasse `ConsolePrinter` muss diese Methode nicht überschreiben, kann sie aber dennoch nutzen.
3. Default-Methoden sind nützlich, wenn Sie einer bestehenden Schnittstelle neue Funktionalität hinzufügen möchten, ohne alle implementierenden Klassen ändern zu müssen.

## Beispiel 4: Statische Methoden in Interfaces
Interfaces können auch statische Methoden enthalten. Diese Methoden gehören direkt zum Interface und können ohne ein Objekt aufgerufen werden.

```java
interface MathUtil {
    static int add(int a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        int result = MathUtil.add(5, 3);
        System.out.println("Das Ergebnis ist: " + result);
    }
}
```
### Erklärung:
1. Die statische Methode `add` im Interface `MathUtil` kann direkt über den Interface-Namen aufgerufen werden.
2. Solche Methoden eignen sich, um Hilfsfunktionen bereitzustellen, die unabhängig von einer konkreten Klasse sind.

### Miniübung:
- Fügen Sie dem Interface `Vehicle` eine statische Methode `getVehicleType` hinzu, die den Typ eines Fahrzeugs zurückgibt.
- Testen Sie diese Methode im `Main`-Programm.

<details>
<summary>Antworten - bitte erst selbst versuchen bevor Sie sich dies ansehen</summary>

```java
interface Vehicle {
    void startEngine();
    void stopEngine();

    static String getVehicleType(String vehicle) {
        switch (vehicle) {
            case "PKW":
                return "Personenkraftwagen";
            case "LKW", "Truck":
                return "Lastkraftwagen";
            case "Bike":
                return "Motorrad";
            case "Bus":
                return "Autobus";
            default:
                return "Fahrzeug";
        }
        return "Fahrzeug";
    }
}

public class Main {
    public static void main(String[] args) {
        String vehicleType = Vehicle.getVehicleType("PKW");
        System.out.println("Fahrzeugtyp: " + vehicleType);
    }
}

```
</details>

## Beispiel 5: ActionListener
Das Interface `ActionListener` aus der Java-Swing-Bibliothek ist ein gutes Beispiel für die Verwendung eines Interfaces, dass Sie im ersten Semester häufig genutzt haben als Sie Oberflächen in Java programmiert haben. Zur Erinnerung: Es ermöglicht die Reaktion auf Benutzeraktionen, wie das Klicken auf einen Button.

### Beispiel: Verwendung eines ActionListeners
```java
import javax.swing.*;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Beispiel");
        JButton button = new JButton("Klick mich!");

        // Implementierung als anonyme Klasse
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println("Button wurde geklickt!");
            }
        });

        frame.add(button);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```
### Erklärung:
1. Das Interface `ActionListener` hat die Methode `actionPerformed`, die ausgeführt wird, wenn eine Aktion ausgelöst wird.
2. In diesem Beispiel wird `ActionListener` mithilfe einer anonymen Klasse implementiert. Dies bedeutet, dass die Implementierung direkt in den Methodenaufruf eingebettet wird, ohne eine separate Klasse zu erstellen.
3. Das Button-Objekt ruft die `actionPerformed`-Methode auf, wenn der Benutzer darauf klickt.

### Erweiterung: Eigene Klasse für ActionListener
```java
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ButtonClickListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button wurde geklickt (mit eigener Klasse)!");
    }
}

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Beispiel");
        JButton button = new JButton("Klick mich!");

        // Implementierung mit eigener Klasse
        button.addActionListener(new ButtonClickListener());

        frame.add(button);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```
### Miniübung:
- Erstellen Sie eine eigene Klasse, die `ActionListener` implementiert, und lassen Sie sie auf verschiedene Button-Klicks reagieren. Achten Sie darauf, dass wenn Sie einen `ActionListener` beispielsweise einem Button hinzufügen, dieser eine neue Instanz der Klasse ist. Das bedeutet, Ihre Klasse ebenfalls vom Typ `ActionListener` ist, da sie das Interface implementiert und sie diese sonst nicht dem Button hinzufügen könnten.

<details>
<summary>Antworten - bitte erst selbst versuchen bevor Sie sich dies ansehen</summary>

```java
import javax.swing.*;
    
class MyButtonClickListener implements ActionListener {
    private String message;

    public MyButtonClickListener(String message) {
        this.message = message;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button wurde geklickt: " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Beispiel");
        JButton button1 = new JButton("Klick mich!");
        JButton button2 = new JButton("Klick mich auch!");

        button1.addActionListener(new MyButtonClickListener("Button 1"));
        button2.addActionListener(new MyButtonClickListener("Button 2"));

        frame.add(button1);
        frame.add(button2);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```
</details>

## Beispiel 6: Erweiterung bestehender Interfaces
Bestehende Interfaces können erweitert werden, um neue Funktionalitäten hinzuzufügen. In der Regel geschieht dies über ein neues Interface, das das bestehende Interface erweitert, also von dem das neue Interface erbt. Falls Sie Zugriff auf das "alte" Interface haben, können Sie es auch direkt erweitern und beispielsweise die Methoden dort direkt hinzufügen. 
Ein einfacheres Beispiel für die Erweiterung eines Interfaces mittels Vererbung:

```java
interface BasicPrinter {
    void print(String message);
}

interface AdvancedPrinter extends BasicPrinter {
    void printError(String errorMessage);
}

class ConsolePrinter implements AdvancedPrinter {
    @Override
    public void print(String message) {
       System.out.println("Time: " + System.currentTimeMillis() + " - " + message);
    }

    @Override
    public void printError(String errorMessage) {
        System.out.println("Fehler: " + errorMessage);
    }
}

public class Main {
    public static void main(String[] args) {
        AdvancedPrinter printer = new ConsolePrinter();
        printer.print("Alles funktioniert.");
        printer.printError("Ein Fehler ist aufgetreten.");
    }
}
```
### Erklärung:
1. Das Interface `AdvancedPrinter` erweitert `BasicPrinter` und fügt eine Methode hinzu.
2. Die Klasse `ConsolePrinter` implementiert beide Methoden.
3. Im `Main`-Programm werden die erweiterten Funktionalitäten genutzt.

### Miniübung:
- Von welchem Typ/welchen Typen ist die Referenzvariable `printer` in der `Main`-Klasse? Warum?

<details>
<summary>Antworten - bitte erst selbst versuchen bevor Sie sich dies ansehen</summary>

Die Referenzvariable `printer` ist vom Typ `AdvancedPrinter`, da sie auf ein `ConsolePrinter`-Objekt zeigt, das das `AdvancedPrinter`-Interface implementiert. Sie ist ebenso vom Typ `BasicPrinter`, da `AdvancedPrinter` das `BasicPrinter`-Interface erweitert. Darüber hinaus sind alle Objekte einer Klasse in Java immer vom Typ `Object`, da sie von der Klasse `Object` erben. 

</details>



### Abschließende Aufgabe:
Ertellen Sie ein Interface für eine Datenbankverbindung, das die Methoden `connect`, `disconnect`, `insert` und `update` enthält. Implementieren Sie es in einer Klasse `MySQLDatabase` und testen Sie die Methoden. Die Inhalte der Methoden können einfach nur eine Ausgabe auf der Konsole sein. Alle Methoden sollten entsprechende Parameter übergeben bekommen, die für die Ausführung dieser sinnvoll sind. Also überlegen Sie sich was die Methoden benötigen, um sinnvoll zu arbeiten.
Falls Sie nun beschließen sollten, nach einer gewissen Zeit die Datenbank zu wechseln (z.B. auf eine Postgresql-Datenbank), können Sie einfach eine neue Klasse erstellen, die das Interface implementiert und die Methoden entsprechend anpassen. Ihre Anwendung wird weiterhin funktionieren, da sie nur das Interface kennt und nicht die konkrete Implementierung. Sie haben damit die Flexibilität und Modularität Ihres Codes erhöht da Sie gegen eine Abstraktion (das Interface) programmieren und nicht gegen eine konkrete Implementierung. 

<details>
<summary>Antworten - bitte erst selbst versuchen bevor Sie sich dies ansehen</summary>

```java
interface Database {
    void connect(String url, String user, String password);
    void disconnect();
    void insert(String table, String data);
    void update(String table, String data);
}

class MySQLDatabase implements Database {
    @Override
    public void connect(String url, String user, String password) {
        // Hier würde der Code stehen, um eine Verbindung zur MySQL-Datenbank herzustellen, den Sie bereits aus dem 1. Semester kennen.
       // Also z.B.: Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println("Verbindung zur MySQL-Datenbank hergestellt.");
    }

    @Override
    public void disconnect() {
        System.out.println("Verbindung zur MySQL-Datenbank getrennt.");
    }

    @Override
    public void insert(String table, String data) {
        // Hier würde der Code stehen, um Daten in die Tabelle einzufügen.
       // Also z.B. PreparedStatement stmt = conn.prepareStatement("INSERT INTO " + table + " VALUES data...");
        System.out.println("Daten in Tabelle " + table + " eingefügt: " + data);
    }

    @Override
    public void update(String table, String data) {
        // Hier würde der Code stehen, um Daten in der Tabelle zu aktualisieren.
         // Also z.B. PreparedStatement stmt = conn.prepareStatement("UPDATE " + table + " SET data...");
        System.out.println("Daten in Tabelle " + table + " aktualisiert: " + data);
    }
}
```
</details>


## Zusammenfassung
In diesem Lab haben Sie gelernt, wie Sie Interfaces in Java verwenden können, um Ihre Programme flexibler und modularer zu gestalten. Sie haben gesehen, wie Interfaces Polymorphismus ermöglichen, lose Kopplung fördern und Erweiterbarkeit unterstützen. Sie haben gelernt, wie Sie Interfaces definieren, implementieren und erweitern können, und haben die Vorteile von Default- und statischen Methoden in Interfaces kennengelernt. Sie haben gesehen, wie Interfaces in der Praxis eingesetzt werden, z.B. für Datenbankverbindungen. Ich hoffe, Sie haben die Beispiele und Miniübungen verstanden und Ihr Verständnis für Interfaces in Java vertieft. Die bereitgestellten Übungen auf Moodle werden Ihr Verständnis weiter vertiefen. Bitte bearbeiten Sie diese, um Ihr Wissen zu festigen. Viel Erfolg!

_© 2025, Prof. Dr. Alexander Bartel, Hochschule Neu-Ulm. Alle Rechte vorbehalten.
Die Vervielfältigung, Verbreitung oder Nutzung dieses Dokuments oder eines Teils davon ohne ausdrückliche schriftliche Genehmigung ist untersagt._