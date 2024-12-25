package tag01;
import javax.swing.*;

public class ASCIICalculator {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("bitte geben Sie ein einzelnen zeichen ein ");

        char character = input.charAt(0);
        int asciivalue = (int) character;

        JOptionPane.showMessageDialog(null, "Der ASCII-Wert von " + character + "ist " + asciivalue);

        String input2 = JOptionPane.showInputDialog(" Bitte geben Sie ein zweites Zeichen ein:");
        char charcter2 = input2.charAt(0);
        int asciivalue2 = (int) charcter2;

        int sum = asciivalue + asciivalue2;
        JOptionPane.showMessageDialog(null, "Die summe der ASCII-wert von " + character + " und " + charcter2 + " ist: " + sum);
    }
}



