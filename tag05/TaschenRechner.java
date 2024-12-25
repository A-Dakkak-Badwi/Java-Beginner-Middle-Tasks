package tag05;

import javax.swing.*;

public class TaschenRechner {
    public static void main(String[] args) {
        boolean continueApp = true;

        do {
            try {
                float eingabe1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Gib die erste Zahl ein:"));

                float eingabe2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Gib die zweite Zahl ein:"));

                String choice = "Wähle eine Operation:\n" +
                        "1: Addition\n" +
                        "2: Subtraktion\n" +
                        "3: Multiplikation\n" +
                        "4: Division\n" +
                        "5: Beenden\n";
                int eingabe3 = Integer.parseInt(JOptionPane.showInputDialog(null, choice));

                double result = 0.0;
                switch (eingabe3) {
                    case 1:
                        result = eingabe1 + eingabe2;
                        break;
                    case 2:
                        result = eingabe1 - eingabe2;
                        break;
                    case 3:
                        result = eingabe1 * eingabe2;
                        break;
                    case 4:
                        if (eingabe2 != 0) {
                            result = eingabe1 / eingabe2;
                        } else {
                            JOptionPane.showMessageDialog(null, "Division durch Null ist nicht erlaubt.");
                            continue;
                        }
                        break;
                    case 5:
                        continueApp = false;
                        continue;
                    default:
                        JOptionPane.showMessageDialog(null, "Ungültige Eingabe. Bitte wähle eine gültige Option.");
                        continue;
                }

                JOptionPane.showMessageDialog(null, "Ergebnis: " + result);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ungültige Eingabe. Bitte gib eine Zahl ein.");
            }

            String wiederholen = JOptionPane.showInputDialog("Möchtest du das Programm wiederholen? (ja/nein)");
            if (wiederholen == null || !wiederholen.equalsIgnoreCase("ja")) {
                continueApp = false;
            }

        } while (continueApp);

        JOptionPane.showMessageDialog(null, "Programm beendet. Danke für die Nutzung!");
    }
}
