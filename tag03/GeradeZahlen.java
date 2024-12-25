package tag03;

import javax.swing.*;

public class GeradeZahlen {
    public static void main(String[] args) {
        int input = Integer.parseInt(JOptionPane.showInputDialog(null, "Gib eine Zahl ein: "));
        if (input % 2 == 0) {
            JOptionPane.showMessageDialog(null, input + " ist eine gerade Zahl.");
        } else {
            JOptionPane.showMessageDialog(null, input + " ist eine ungerade Zahl.");

        }
    }
}
