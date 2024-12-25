package tag02;
import javax.swing.*;

public class Zeitberechnung {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Bitte geben sie die zeitangabe in Millisekunde ein ");
        long eingabe = Long.parseLong(input);
        long sekunden = eingabe / 1000;
        long restmilisekunden = eingabe % 1000;

        long minute = sekunden / 60;
        long restsekunden = sekunden % 60;

        long stunden = minute / 60 ;
        long restminute = minute % 60;

         long tag = stunden / 24;
         long reststunden = stunden % 24;

         long jahr = tag / 365;
         long restTAg = tag % 365;

         JOptionPane.showMessageDialog(null, input + " Milisekunden entspreschen: \n" +
                 jahr + " Jahren " + restTAg + " Tagen " + reststunden + " Stunden " + restminute + " minuten "
                 + restsekunden + " Sekunden und " + restmilisekunden);

    }
}
