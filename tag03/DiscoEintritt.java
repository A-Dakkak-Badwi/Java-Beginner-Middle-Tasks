package tag03;
import javax.swing.*;

public class DiscoEintritt {
    public static void main(String[] args) {
        String istErwachsen = JOptionPane.showInputDialog("Bist du mindestens 18 ? Ja / Nein  ");

        if (istErwachsen.equalsIgnoreCase("ja")) {



            //VIP-Status abfragen: Falls der Gast 18 Jahre oder älter ist, wird abgefragt, ob der Benutzer ein
            //VIP ist.
            String istVIP = JOptionPane.showInputDialog(" Sind Sie ein VIP ? JA / Nein");
            if (istVIP.equalsIgnoreCase("ja")) {
               JOptionPane.showMessageDialog(null, "Du erhältst VIP zugang   ");
            }

            //Geschlecht abfragen: Falls der Gast 18 Jahre oder älter ist, wird abgefragt, ob der Gast eine Frau
            //ist (da heute Ladies-Night ist).

            String istFrau = JOptionPane.showInputDialog(" Sind Sie ein Frau ? JA / Nein");
            if (istFrau.equalsIgnoreCase("ja")) {
                JOptionPane.showMessageDialog(null,"Da heute ladis-Night ist ");
            }
            //18 oder älter, VIP und Frau: Der Gast erhält einen VIP-Zugang und einen Rabatt auf Ge-
            //tränke
           JOptionPane.showMessageDialog(null, "Herzlich wilkommen in der Disco !vile Spaß in der Ladies Night .Du bekommst 15% Rabatt auf Getränke ");

           if (istFrau.equalsIgnoreCase("nein ") && istVIP.equalsIgnoreCase("nein")) {
               JOptionPane.showMessageDialog(null," Der Gast erhält eine normale angebot");
           }

        } else {
            //Jünger als 18: Der Gast darf nicht eintreten
            JOptionPane.showMessageDialog(null, "Du kommst nicht rein");

        }
    }
}