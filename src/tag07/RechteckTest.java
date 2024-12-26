package tag07;

import tools.Tools;

/**
 * Erstelle eine Klasse mit dem Namen Rechteck. Die Klasse soll über die Attribute laenge und breite
 * als double-Werte verfügen. Anschließend erstelle ein Konstruktor mit leerer Parameterliste, der die
 * beiden Kantenlängen jeweils mit dem Wert 0 initialisiert. Ein weiterer Konstruktor mit zwei doubleParametern soll
 * die beiden Kantenlängen mit den übergebenen Werten initialisieren. Die Klasse soll zusätzlich über die folgenden
 * Methoden verfügen:
 */
public class RechteckTest {
    public static void main(String[] args) {
//        test1();

        test2();
    }

    private static void test1() {
        Rechteck r = new Rechteck();
        System.out.println("r = \n" + r);

        Rechteck r2 = new Rechteck(3.2, 3.1);
        System.out.println("r2 = \n" + r2);

        Rechteck r3 = new Rechteck();
        r3.setSeiten(10.1515115, 5.551515115);
        System.out.println(r3);
        System.out.println("Lange Seite: \t\t" + r3.getLangeSeite());
        System.out.println("Kurze Seite: \t\t" + r3.getKurzeSeite());
        System.out.printf("Fläche: %.2f\t\t\n", r3.getFlaeche());
        System.out.printf("Umfang: %.2f\t\t\n", r3.getUmfang());
        System.out.printf("Diagonale: %.2f\t\t\n", r3.getDiagonale());

        r3.laengeAusgaben();

    }

    private static void test2() {
        double laenge = Tools.kommazahlEingeben("Bitte Länge eingeben: ");
        double breite = Tools.kommazahlEingeben("Bitte Breite eingeben: ");

        Rechteck rechteck = new Rechteck(laenge, breite);


        System.out.println("\nDas erzeugte Rechteck hat folgende Eigenschaften:");
        System.out.println(rechteck);

//        System.out.println("Länge: " + rechteck.getLaenge());
//        System.out.println("Breite: " + rechteck.getBreite());
//        System.out.println("Fläche: " + rechteck.getFläche());
//        System.out.println("Umfang: " + rechteck.getUmfang());
//        System.out.println("Diagonale: " + rechteck.getDiagonale());

        Tools.ausgeben(rechteck.toString());

        rechteck.laengeVergroessern(5);
        System.out.println("Länge nach Vergrößern: " + rechteck.getLaenge());

        rechteck.laengeVerkleinern(2);
        System.out.println("Länge nach Verkleinern: " + rechteck.getLaenge());

        rechteck.breiteVergroessern(5);
        System.out.println("Breite nach Vergrößern: " + rechteck.getBreite());

        rechteck.breiteVerkleinern(2);
        System.out.println("Breite nach Verkleinern: " + rechteck.getBreite());
    }

}
