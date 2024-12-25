import javax.swing.*;

public class Tools {
    /**
     * Zeigt einen Eingabedialog und gibt die Benutzereingabe zurück
     *
     * @param nachricht as String
     * @return benutzerEingabe as int
     */
    public static int zahlEingeben(String nachricht) {
        String eingabe = JOptionPane.showInputDialog(nachricht);
        return (eingabe == null) ? 0 : Integer.parseInt(eingabe);
    }


    public static String textEingeben(String nachricht) {
        return JOptionPane.showInputDialog(nachricht);
    }

    public static void ausgeben(String nachricht) {
        JOptionPane.showMessageDialog(null, nachricht);
    }

}
