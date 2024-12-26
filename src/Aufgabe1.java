package tag06;
/**
 Du sollst eine einfache Java-Klasse erstellen, die ein Benutzerkonto beschreibt. In dieser Klasse sollen
 mehrere Instanzattribute (Eigenschaften) definiert werden, sowie Methoden (Funktionen), um grundlegende Operationen
 auf dem Konto auszuführen. Du wirst außerdem eine separate Testklasse erstellen, um Objekte der Klasse Benutzerkonto
 zu erzeugen und deren Methoden zu testen. Die Ausgabe soll
 auf der Konsole erzeugt werden.
 */
public class Aufgabe1 {
    public static void main(String[] args) {
        //Erstelle die Klasse Benutzerkonto
        testeKontoAktivieren();
//        testeValidierung();
    }

    private static void testeKontoAktivieren() {
        Benutzerkonto konto2 = new Benutzerkonto();
        konto2.benutzername = "Erik2";
        konto2.email = "elena@gmail.com";
        konto2.zeigeStatus();
        konto2.kontoAktivieren();
        konto2.zeigeStatus();
        konto2.kontoDeaktivieren();
        konto2.zeigeStatus();
    }

    private static void testeValidierung() {
        Benutzerkonto konto = new Benutzerkonto();
        konto.benutzername = "Erik2";
        konto.email = "erik@gmail.com";
        konto.aendereEmail("elena@gmail.com");

        boolean istValid = konto.validiereBenutzernameUndEmail("Erik", "elena@gmail.com");
        System.out.println("istValid = " + istValid);

        istValid = konto.validiereBenutzernameUndEmail("Erik2", "elena@gmail.com");
        System.out.println("istValid = " + istValid);

        istValid = konto.validiereBenutzernameUndEmail("Erik", "elena2@gmail.com");
        System.out.println("istValid = " + istValid);

        istValid = konto.validiereBenutzernameUndEmail("Erik2", "elena2@gmail.com");
        System.out.println("istValid = " + istValid);
    }
}
