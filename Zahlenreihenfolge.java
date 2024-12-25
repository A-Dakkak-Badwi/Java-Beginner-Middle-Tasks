package tag05;

import util.Tools;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Aufgabe: Zahlenreihenfolge ermitteln
 * Ein kleines Unternehmen benötigt ein Programm, das drei vom Benutzer eingegebene Zahlen in auf-
 * steigender Reihenfolge ausgibt. Das Ziel ist es, die Zahlen so anzuordnen, dass sie der Größe nach sor-
 * tiert angezeigt werden, ohne dabei fortgeschrittene Datenstrukturen wie Arrays oder Listen zu verwenden.
 * Diese Aufgabe dient der Übung von logischen Vergleichen und dem Einsatz von if-else-Verzweigungen.
 */
public class Zahlenreihenfolge {
    public static void main(String[] args) {
        // Das Programm soll den Benutzer auffordern, drei ganze Zahlen nacheinander einzugeben
        int zahl1 = Tools.zahlEingeben("Bitte Geben Sie Die erste Zahl ein ");
        int zahl2 = Tools.zahlEingeben("Bitte Geben Sie Die zweite Zahl ein ");
        int zahl3 = Tools.zahlEingeben("Bitte Geben Sie Die dritte  Zahl ein ");

//        sortierungMitIfElse(zahl1, zahl2, zahl3);
        List<Integer> zahlen = Arrays.asList(zahl1, zahl2, zahl3);
        zahlen.sort(Comparator.naturalOrder());
        Tools.ausgeben("Die Zahlen in aufsteigender Reihenfolge :\n" + zahlen);

    }

    private static void sortierungMitIfElse(int zahl1, int zahl2, int zahl3) {
        // Die drei Zahlen sollen anschließend in aufsteigender Reihenfolge ausgegeben werden.
        int kleinste, mittlere, größte;

        // zahl1 ist die kleinste Zahl
        if (zahl1 <= zahl2 && zahl1 <= zahl3) {
            kleinste = zahl1;
            if (zahl2 <= zahl3) {
                mittlere = zahl2;
                größte = zahl3;
            } else {
                mittlere = zahl3;
                größte = zahl2;
            }
        }
        // zahl2 ist die kleinste
        else if (zahl2 <= zahl1 && zahl2 <= zahl3) {
            kleinste = zahl2;
            if (zahl1 <= zahl3) {
                mittlere = zahl1;
                größte = zahl3;
            } else {
                mittlere = zahl3;
                größte = zahl1;
            }
        }
        // zahl3 ist die kleinste
        else {
            kleinste = zahl3;
            if (zahl1 <= zahl2) {
                mittlere = zahl1;
                größte = zahl2;
            } else {
                mittlere = zahl2;
                größte = zahl1;
            }

        }


        String ausgabe = "Die Zahlen in aufsteigender Reihenfolge :\n"
                + kleinste + " " + mittlere + " " + größte;
        Tools.ausgeben(ausgabe);
    }
}
