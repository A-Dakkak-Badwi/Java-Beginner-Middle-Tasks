package tag02;
import javax.swing.*;

/**
 * Aufgabe: Durchschnittliche Niederschlagsmenge
 * Schreibe ein Programm, dass die durchschnittliche Niederschlagsmenge von den Monaten April, Mai
 * und Juni ausgibt.
 */
public class DurchschnittlicheNiederschlagsmenge {
    public static void main(String[] args) {
        //Erfasse die Werte des Nutzers in sinnvoll bezeichnende Variablen.
        // Welcher Datentyp eignet sich am besten für Niederschlagsmengen?
        String eingabe = JOptionPane.showInputDialog("Bitte geben Sie Niederschlag April  ein ");
        double april = Double.parseDouble(eingabe);

        eingabe = JOptionPane.showInputDialog("Bitte geben SIe Niederschlag mai  ein ");
        double mai = Double.parseDouble(eingabe);

        eingabe = JOptionPane.showInputDialog("Bitte geben SIe Niederschlag juni  ein ");
        double juni = Double.parseDouble(eingabe);

        //. Berechne den Durchschnitt der drei Eingaben des Nutzers
        double durchschnitt = (april + mai + juni) / 3;

        //Gib die Eingaben noch einmal kombiniert mit der Berechnung des Durchschnitts aus.
        String ausgabe = String.format("Die Niederschlagsmenge für April ist: %.2f l/qm\n", april);
        ausgabe += String.format("Die Niederschlagsmenge für Mai ist: %.2f l/qm\n", mai);
        ausgabe += String.format("Die Niederschlagsmenge für Juni ist: %.2f l/qm\n\n", juni);
        ausgabe += String.format("Die durchschnittliche Niederschlagsmenge ist: %.2f l/qm", durchschnitt);

        JOptionPane.showMessageDialog(null, ausgabe);

    }
}
