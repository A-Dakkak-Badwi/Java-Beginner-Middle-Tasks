package tag06;

public class ProfilTest {
    public static void main(String[] args) {
        // Setze die Werte für das Profil Objekt.
        Profil profil = new Profil("Ayse", "Yilmaz", "16.10.1960");

        // Setze die Werte für das Benutzerkonto Objekt
        Benutzerkonto konto = new Benutzerkonto("ayse123", "ayse@gmail.com" );
        konto.speichereProfil(profil);
        konto.zeigeStatus();
    }
}
