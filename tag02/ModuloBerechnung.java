package tag02;
import javax.swing.JOptionPane;

public class ModuloBerechnung {
    public static void main(String[] args) {
        String eingabeZahl1 = JOptionPane.showInputDialog("Bitte geben Sie die erste Zahl ein:");
        int zahl1 = Integer.parseInt(eingabeZahl1);

        String eingabeZahl2 = JOptionPane.showInputDialog("Bitte geben Sie die zweite Zahl ein:");
        int zahl2 = Integer.parseInt(eingabeZahl2);

        int rest = zahl1 % zahl2;

        String ausgabe = "Der Rest der Division von " + zahl1 + " durch " + zahl2 + " beträgt " + rest;
        JOptionPane.showMessageDialog(null, ausgabe, "Modulo-Berechnung", JOptionPane.INFORMATION_MESSAGE);
    }
}
