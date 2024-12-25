package tag03;
import javax.swing.*;

/*
*Schreibe ein Programm, das basierend auf dem Alter des Benutzers eine Alterskategorie zurückgibt. Der
*Benutzer gibt sein Alter ein, und das Programm kategorisiert ihn als Kind, Teenager, Erwachsener oder
*Senior
*/
public class Alterskategorie {
    public static void main(String[] args) {
        //Das programm fragt nach ein ganze zahl ein:
        String eingabe = JOptionPane.showInputDialog("Biette schreib eine ganzzahl ein ");
        int alter=Integer.parseInt(eingabe);

        // Verwende eine if-else-Struktur, um die richtige Alterskategorie zu bestimmen:
        //a. 0–12: Kind
        //b. 13–19: Teenager
        //c. 20–64: Erwachsener
        //d. 65 und älter: Senior
        String  ausgabe = "Du bist ein ";

        if (alter <= 12 ) {
            ausgabe += "kind";
        }else if (alter >= 19 ) {
            ausgabe += "Teenager";
        }else if (alter >= 64) {
            ausgabe += " Erwachsener" ;

        }else{
            ausgabe += "Senior";

        }
        JOptionPane.showMessageDialog(null, ausgabe);



    }
}
