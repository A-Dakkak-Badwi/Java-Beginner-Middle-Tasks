package tag08.lösungen;

public class _10_Mitarbeiter {

    // Private Attribute (Datenkapselung)
    private String mitarbeiterID;
    private String name;
    private String position;
    private double gehalt;
    private int erfahrungsjahre;

    // Konstruktoren mit Konstruktorverkettung und Validierung
    public _10_Mitarbeiter() {
        this("unbekannt", "unbekannt", "unbekannt", 0.0, 0);
    }

    public _10_Mitarbeiter(String mitarbeiterID, String name, String position) {
        this(mitarbeiterID, name, position, 0.0, 0);
    }

    public _10_Mitarbeiter(String mitarbeiterID, String name, String position, double gehalt, int erfahrungsjahre) {
        setMitarbeiterID(mitarbeiterID);
        setName(name);
        setPosition(position);
        setGehalt(gehalt);
        setErfahrungsjahre(erfahrungsjahre);
    }

    // Getter- und Setter-Methoden mit Validierungslogik
    public String getMitarbeiterID() {
        return mitarbeiterID;
    }

    public void setMitarbeiterID(String mitarbeiterID) {
        if (mitarbeiterID != null && !mitarbeiterID.equals("")) {
            this.mitarbeiterID = mitarbeiterID;
        } else {
            System.out.println("MitarbeiterID darf nicht leer sein. Standardwert 'unbekannt' wird gesetzt.");
            this.mitarbeiterID = "unbekannt";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.equals("")) {
            this.name = name;
        } else {
            System.out.println("Name darf nicht leer sein. Standardwert 'unbekannt' wird gesetzt.");
            this.name = "unbekannt";
        }
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        if (position != null && !position.equals("")) {
            this.position = position;
        } else {
            System.out.println("Position darf nicht leer sein. Standardwert 'unbekannt' wird gesetzt.");
            this.position = "unbekannt";
        }
    }

    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(double gehalt) {
        if (gehalt >= 0) {
            this.gehalt = gehalt;
        } else {
            System.out.println("Gehalt kann nicht negativ sein. Standardwert 0.0 wird gesetzt.");
            this.gehalt = 0.0;
        }
    }

    public int getErfahrungsjahre() {
        return erfahrungsjahre;
    }

    public void setErfahrungsjahre(int erfahrungsjahre) {
        if (erfahrungsjahre >= 0) {
            this.erfahrungsjahre = erfahrungsjahre;
        } else {
            System.out.println("Erfahrungsjahre können nicht negativ sein. Standardwert 0 wird gesetzt.");
            this.erfahrungsjahre = 0;
        }
    }

    // Überladene Methode berechneBonus()

    /**
     * Berechnet den Bonus nach einer Standardformel.
     */
    public double berechneBonus() {
        // Beispielhafte Standardberechnung: 10% des Gehalts
        double bonus = gehalt * 0.10;
        // runden auf 2 Nachkommastellen
        return Math.round(bonus * 100d) / 100d;
    }

    /**
     * Berechnet den Bonus mit einem angegebenen Faktor.
     */
    public double berechneBonus(double faktor) {
        double bonus = gehalt * faktor;
        return Math.round(bonus * 100d) / 100d;
    }

    /**
     * Berechnet den Bonus mit einem Faktor und einer Sonderzulage
     */
    public double berechneBonus(double faktor, double sonderzulage) {
        double bonus = (gehalt * faktor) + sonderzulage;
        return Math.round(bonus * 100d) / 100d;
    }

    /**
     * Gibt alle Informationen des Mitarbeiters aus.
     */
    public void zeigeMitarbeiterInfo() {
        this.zeigeMitarbeiterInfo(true);
    }

    // Überladene Methode zeigeMitarbeiterInfo()
    /**
     * Gibt die Informationen des Mitarbeiters aus, optional mit oder ohne Gehalt.
     */
    public void zeigeMitarbeiterInfo(boolean mitGehalt) {
        System.out.println("MitarbeiterID: " + mitarbeiterID);
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        if (mitGehalt) {
            System.out.println("Gehalt: " + gehalt);
        }
        System.out.println("Erfahrungsjahre: " + erfahrungsjahre);
    }
}

