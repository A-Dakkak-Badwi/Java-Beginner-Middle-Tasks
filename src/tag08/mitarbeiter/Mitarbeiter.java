package tag08.mitarbeiter;

public class Mitarbeiter {

    private String mitarbeiterID;
    private String name;
    private String position;
    private double gehalt;
    private int erfahrungsjahre;

    public Mitarbeiter() {
        this.mitarbeiterID = "Unbekannt";
        this.name = "Unbekannt";
        this.position = "Unbekannt";
        this.gehalt = 0.0;
        this.erfahrungsjahre = 0;
    }

    public Mitarbeiter(String mitarbeiterID, String name, String position) {
        this.setMitarbeiterID(mitarbeiterID);
        this.setName(name);
        this.setPosition(position);
        this.setGehalt(0.0);
        this.setErfahrungsjahre(0);
    }

    public Mitarbeiter(String mitarbeiterID, String name, String position, double gehalt, int erfahrungsjahre) {
        this.setMitarbeiterID(mitarbeiterID);
        this.setName(name);
        this.setPosition(position);
        this.setGehalt(gehalt);
        this.setErfahrungsjahre(erfahrungsjahre);
    }

    public String getMitarbeiterID() {
        return mitarbeiterID;
    }

    public void setMitarbeiterID(String mitarbeiterID) {
        if (mitarbeiterID != null && !mitarbeiterID.trim().isEmpty()) {
            this.mitarbeiterID = mitarbeiterID;
        } else {
            System.out.println("❤️'MitarbeiterID' \t\t**❤ darf nicht leer oder null sein." +
                    "Standardwert 'Unbekannt' wird verwendet.");
            this.mitarbeiterID = "Unbekannt";
        }
    }

    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(Double gehalt) {
        if (gehalt == null || gehalt.isNaN() || gehalt < 0.0) {
            System.out.println
                    ("❤️'Gehalt' \t\t\t\t**❤ darf nicht leer, null oder negativ sein." +
                            "Standardwert 0.0 wird verwendet.");
            this.gehalt = 0.0;
        } else {
            this.gehalt = gehalt;
        }
    }

    public int getErfahrungsjahre() {
        return erfahrungsjahre;
    }

    public void setErfahrungsjahre(Integer erfahrungsjahre) {
        if (erfahrungsjahre == null || erfahrungsjahre < 0) {
            System.err.println
                    ("❤️'Erfahrungsjahre' \t**❤ dürfen nicht leer, null oder negativ sein." +
                            "Standardwert 0 wird verwendet.");
            this.erfahrungsjahre = 0;
        } else {
            this.erfahrungsjahre = erfahrungsjahre;
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("❤️'Name' \t\t\t\t**❤ darf nicht leer oder null sein." +
                    "Standardwert 'Unbekannt' wird verwendet.");
            this.name = "Unbekannt";
        }
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        if (position != null && !position.trim().isEmpty()) {
            this.position = position;
        } else {
            System.out.println("❤️'position' \t\t\t**❤ darf nicht leer oder null sein." +
                    "Standardwert 'Unbekannt' wird verwendet.");
            this.position = "Unbekannt";
        }    }

    @Override
    public String toString() {
        return String.format(
                "MitarbeiterID: \t\t\t\t%s\n" +
                "Name: \t\t\t\t\t\t%s\n" +
                "Position: \t\t\t\t\t%s\n" +
                "Gehalt: \t\t\t\t\t%.2f\n" +
                "Erfahrungsjahre:\t\t\t%d"
                ,getMitarbeiterID(), getName(), getPosition(), getGehalt(), getErfahrungsjahre()
        );
    }
}
