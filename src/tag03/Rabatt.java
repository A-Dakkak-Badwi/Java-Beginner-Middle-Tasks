package tag03;
import javax.swing.JOptionPane;

public class Rabatt {
    public static void main(String[] args) {
        // Eingabe des Alters und des Preises
        String eingabeAlter = JOptionPane.showInputDialog("Gib dein Alter ein");
        int alter = Integer.parseInt(eingabeAlter);

        String eingabePreis = JOptionPane.showInputDialog("Gib den Preis des Produkts ein");
        double preis = Double.parseDouble(eingabePreis);

        // Berechnung des Rabatts
        double rabatt = (alter < 18) ? 0.20 : 0.10;
        double rabattBetrag = preis * rabatt;
        double endpreis = preis - rabattBetrag;

        // Ausgabe des Rabatts und des Endpreises
        JOptionPane.showMessageDialog(null, "Du erhältst einen Rabatt von " + (rabatt * 100) + "%.");
        JOptionPane.showMessageDialog(null, "Der Endpreis nach Anwendung des Rabatts beträgt: " + endpreis + " Euro");
    }
}