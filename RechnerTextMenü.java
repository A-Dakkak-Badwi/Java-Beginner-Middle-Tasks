package tag05;

import util.Tools;

/**
 * Aufgabe: Rechner mit Text Menü
 * Das Problem
 * Schreibe ein Programm, das ein einfaches Menü zur Auswahl von Berechnungen anzeigt. Der Benutzer
 * kann zwischen verschiedenen Berechnungsoptionen wählen (Addition, Subtraktion, Multiplikation, Di-
 * vision). Nach jeder Berechnung wird das Ergebnis angezeigt. Die Berechnung wiederholt sich, bis der
 * Benutzer entscheidet, das Programm zu beenden.
 */
public class RechnerTextMenü {
    public static void main(String[] args) {

        String wiederholen ;
        do {


//Der Benutzer gibt zwei Zahlen ein
            int zahl1 = Tools.zahlEingeben("Bitte gib erste zahl ein");
            int zahl2 = Tools.zahlEingeben("Bitte gib zweite zahl ein");

            //Zeige ein Menü mit den Berechnungsoptionen (Addition, Subtraktion, Multiplikation, Division
            String ausgabe = "Wählen eine Operation : \n";
            ausgabe += "1: Addition \n";
            ausgabe += "2: Substraktion \n";
            ausgabe += "3: Multipikation \n";
            ausgabe += "4: Division \n";
            ausgabe += "5: Beenden \n";
            int operation = Tools.zahlEingeben(ausgabe);
            //Verwende eine Switch-Case Struktur, um basierend auf der Auswahl des Benutzers die richtige
            //Berechnung auszuführen
            //Zeige das Ergebnis an.

            switch (operation) {
                case 1:
                    Tools.ausgeben("Ergebnis der Addition ist  : " + (zahl1 + zahl2));
                    break;
                case 2:
                    Tools.ausgeben("Ergebnis der Substraktion ist  : " + (zahl1 - zahl2));
                    break;
                case 3:
                    Tools.ausgeben("Ergebnis der Multiplikation ist  : " + (zahl1 * zahl2));
                    break;
                case 4:
                    if (zahl2 != 0) {
                        Tools.ausgeben("Ergebnis der Division ist  : " + (zahl1 / zahl2));
                    } else {
                        Tools.ausgeben("Division durch null ist nicht erlaubt: " + (zahl1 / zahl2));
                    }
                    break;
                case 5:


                    Tools.ausgeben("Das programm wird bended");
                    break;

                default:

                    Tools.ausgeben("Ungülitge optionen .Bitte Wählen sie eine ander optionen");
                    break;
            }
            wiederholen = Tools.textEingeben("Möchtest du das Programm wiederholen ? ja/ nein");

        }while (wiederholen != null && wiederholen.equalsIgnoreCase("ja")) ;

        }



    }

