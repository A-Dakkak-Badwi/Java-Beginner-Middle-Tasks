package tag06;

public class Benutzerkonto {
    String benutzername;
    String email;
    boolean aktiv; // Status des Kontos
    // Speichere das Profil im Benutzerkonto Objekt.
    Profil profil;

    public Benutzerkonto() {}

    public Benutzerkonto(String benutzername, String email) {
        this.benutzername = benutzername;
        this.email = email;
    }

    void zeigeStatus() {
        System.out.println("\nBenutzerkonto **********");
        System.out.println("Benutzername: " + benutzername);
        System.out.println("Email: " + email);
        System.out.println("Aktiv: " + ((aktiv) ? "Ja" : "Nein"));

        // Gib den Status des Benutzerkontos und des Profils über die Methode zeigeStatus() aus.
        if (profil != null) {
            profil.zeigeProfil();
        } else {
            System.out.println("Profil: nicht vorhanden.");
        }
    }

    void kontoAktivieren() {
        aktiv = true;
        System.out.println("Konto von " + benutzername + " wurde aktiviert.");
    }

    void kontoDeaktivieren() {
        aktiv = false;
        System.out.println("Konto von " + benutzername + " wurde deaktiviert.");
    }

    boolean validiereBenutzernameUndEmail(String benutzername, String email) {
        return this.benutzername.equals(benutzername) && this.email.equals(email);
    }

    // Implementiere eine Methode, speichereProfil(Profil profil), um das Profil zu speichern.
    void speichereProfil(Profil profil) {
        this.profil = profil;
        System.out.println("Profil wurde dem Benutzerkonto hinzugefügt.");
    }

    public void aendereEmail(String mail) {
        email = mail;
    }
}
