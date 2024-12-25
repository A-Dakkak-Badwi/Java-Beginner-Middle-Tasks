package tag03;
import javax.swing.*;

public class Disco2 {
    public static void main(String[] args) {
        // Alter prüfen
        String alter = JOptionPane.showInputDialog("Bist du älter als 18?");
        String vip = JOptionPane.showInputDialog("Bist du ein VIP?");
        String geschlecht = JOptionPane.showInputDialog("Bist du ein M oder eine W?");


        if (alter.equalsIgnoreCase("nein")) {
            JOptionPane.showMessageDialog(null, "Du kommst hier nicht rein.");
        }
        else if (alter.equalsIgnoreCase("ja") && vip.equalsIgnoreCase("ja")
                && geschlecht.equalsIgnoreCase("W")) {
            JOptionPane.showMessageDialog(null, "Herzlich Willkommen in der Disco! \n" +
                    "Viel Spaß in der VIP Lounge! Heute ist Ladies' Night. Du bekommst 15% Rabatt auf Getränke.");
        } else if (alter.equalsIgnoreCase("ja") && vip.equalsIgnoreCase("nein")
                && geschlecht.equalsIgnoreCase("W")) {
            JOptionPane.showMessageDialog(null, "Herzlich Willkommen in der Disco! \n" +
                    "Heute ist Ladies' Night. Du bekommst 15% Rabatt auf Getränke.");
        } else if (alter.equalsIgnoreCase("ja") && vip.equalsIgnoreCase("ja")
                && geschlecht.equalsIgnoreCase("M")) {
            JOptionPane.showMessageDialog(null, "Herzlich Willkommen in der Disco! \n" +
                    "Viel Spaß in der VIP Lounge!");
        } else if (alter.equalsIgnoreCase("ja") && vip.equalsIgnoreCase("nein")
                && geschlecht.equalsIgnoreCase("M")) {
            JOptionPane.showMessageDialog(null, "Herzlich Willkommen in der Disco!");
        } else {
            JOptionPane.showMessageDialog(null, "Ungültige Angabe bitte Prüf deine Angaben");
        }
    }
}
