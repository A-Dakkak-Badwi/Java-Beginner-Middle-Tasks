package tag03;

import javax.swing.*;

public class KB2MB2B {
    public static void main(String[] args) {
        float kilobyte = Float.parseFloat(JOptionPane.showInputDialog(null, "Gib die Größe in Kilobyte ein: "));

        while (kilobyte <= 0) {
            kilobyte = Float.parseFloat(JOptionPane.showInputDialog(null, "Gib eine positive Zahl ein: "));
        }

        float megabyte = kilobyte / 1024;
        float bytes = kilobyte * 1024;

        String megabyteFormatted = String.format("%.2f", megabyte);
        String bytesFormatted = String.format("%.2f", bytes);

        JOptionPane.showMessageDialog(null, kilobyte +
                " KB entsprechen " + megabyteFormatted + " MB und " + bytesFormatted + " Bytes");
    }
}
