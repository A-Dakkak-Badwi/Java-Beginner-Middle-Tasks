package tag01;

import javax.swing.*;

public class LaengeBreite {
    public static void main(String[] args) {

        float Länge = Integer.parseInt(JOptionPane.showInputDialog(null, "Bitte geben Sie die Länge ein: "));
        float Breite = Integer.parseInt(JOptionPane.showInputDialog(null, "Bitte geben Sie die Breite ein: "));
        String Masseinheit = JOptionPane.showInputDialog(null, "Bitte geben Sie die Masseinheit ein: ");

        float Umfang = 2* Länge + 2*  Breite;
        float Fläsche = Länge * Breite;

        String ergebnis = "Die eingegebene Länge beträgt: " + Länge + Masseinheit + "\n";
        ergebnis += "Die eingegebene Breite betraegt: " + Breite + Masseinheit + "\n";
        ergebnis += "\n";
        ergebnis += "Der Umfang betraegt: " + Umfang + Masseinheit + "\n";
        ergebnis += "Die Fläsche betraegt: " + Fläsche + Masseinheit + "\n";

        JOptionPane.showMessageDialog(null, ergebnis);
    }
}
