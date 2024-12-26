package tag07;

/**
 * Aufgabe 1:
 * Erstellen eine Klasse mit dem Namen Kreis. Die Klasse soll nur über ein Datenelement (Attribut) mit
 * dem Namen radius verfügen, in dem der Radius als Kommazahl festgehalten wird. Erstelle einen
 * Konstruktor mit leerer Parameterliste, der den Radius mit dem Wert 0 initialisiert, und einen Konstruktor,
 * dem als Parameter eine Kommazahl zur Initialisierung des Radius übergeben wird.
 */
public class Kreis {
    // Die Klasse soll nur über ein Datenelement (Attribut) mit
    //dem Namen radius verfügen, in dem der Radius als Kommazahl festgehalten wird.
    private double radius;

    // Erstelle einen Konstruktor mit leerer Parameterliste, der den Radius mit dem Wert 0 initialisiert
    public Kreis() {
        this.radius = 0.0;
    }

    // Konstruktor, dem als Parameter eine Kommazahl zur Initialisierung des Radius übergeben wird
    public Kreis(double radius) {
        this.radius = radius;
    }

    // Getter und Setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Implementiere die Methode getUmfang()
    public double getUmfang() {
        return 2 * Math.PI * radius;
    }

    // Implementiere die Methode getFläche()
    public double getFläche() {
        return Math.PI * radius * radius;
    }


    public double getRadiusByUmfang() {
        return radius;
    }

    public void setRadiusByUmfang(double umfang) {
        this.radius = umfang / (2 * Math.PI);
    }

    public double getRadiusByFlaeche() {
        return radius;
    }

    public void setRadiusByFlaeche(double flaeche) {
        this.radius = Math.sqrt(flaeche / Math.PI);
    }

    @Override
    public String toString() {
        return String.format("Der Radius beträgt: \t\t\t%.2f\n"
                + "Der Umfang beträgt: \t\t\t%.2f\n"
                + "Die Fläche beträgt: \t\t\t%.2f"
                , radius, getUmfang(), getFläche()
        );
    }
}
