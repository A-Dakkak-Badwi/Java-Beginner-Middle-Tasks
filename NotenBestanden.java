package tag03;
import javax.swing.*;

public class NotenBestanden {
    public static void main(String[] args) {
        String  eingabe = JOptionPane.showInputDialog("Gib deine Note ein (1 - 6):  ");
        int note = Integer.parseInt(eingabe);
        if (note >= 1 && note <= 4) {
            JOptionPane.showMessageDialog(null, "bestanden  " );

        } else if (note >=5 && note <=6) {
            JOptionPane.showMessageDialog(null, "nicht bestanden");

        }else{
            JOptionPane.showMessageDialog(null,"Deine eingabe ist falsch");
        }

    }
}
