package tag08.mitarbeiter_bonus;

public class _10_MitarbeiterTest {
	// Hauptmethode zum Testen der überladenen Methoden
    public static void main(String[] args) {
        _10_Mitarbeiter mitarbeiter = new _10_Mitarbeiter("EMP001", "Anna Schmidt", "Entwicklerin", 34535, 5);

     // Test der überladenen Methoden zeigeMitarbeiterInfo()
        System.out.println("Mitarbeiterinformationen (mit Gehalt):");
        mitarbeiter.zeigeMitarbeiterInfo();
        
        System.out.println();
        
        System.out.println("Mitarbeiterinformationen (ohne Gehalt):");
        mitarbeiter.zeigeMitarbeiterInfo(false);
        
        System.out.println();
        
        // Test der überladenen Methoden berechneBonus()
        System.out.println("Standardbonus: " + mitarbeiter.berechneBonus());
        System.out.println("Bonus mit Faktor 0.15: " + mitarbeiter.berechneBonus(0.1535345));
        System.out.println("Bonus mit Faktor 0.15 und Sonderzulage 1000: " + mitarbeiter.berechneBonus(0.15, 1000));

       

        

        
    }
}
