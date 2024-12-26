package tag06;

/**
 * Aufgabe: Erweiterung der Klasse Benutzerkonto mit der Klasse Profil
 * In dieser Aufgabe soll die vorhanden Klasse Benutzerkonto aus der
 * Aufgabe 02_BenutzerkontoErweitern übernommen und erweitert werden um eine Profil Klasse.
 * Die Profil-Klasse soll Teil der Benutzerkonto-Klasse sein. Das Profil enthält grundlegende Infor-
 * mationen über den Benutzer, wie den vollständigen Namen und das Geburtsdatum. Die Klasse Profil
 * soll als Referenzvariable in der Klasse Benutzerkonto gespeichert werden.
 */
public class Profil {
    String vorname;
    String nachname;
    String geburtsdatum;

    public Profil(String vorname, String nachname, String geburtsdatum) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsdatum = geburtsdatum;
    }

    // Implementiere eine Methode zeigeProfil(), die den vollständigen
    // Namen und das Geburtsdatum des Benutzers ausgibt
    void zeigeProfil() {
        System.out.println("\nProfil **********");
        System.out.println("Vorname: " + vorname);
        System.out.println("Nachname: " + nachname);
        System.out.println("Geburtsdatum: " + geburtsdatum);
    }


}
