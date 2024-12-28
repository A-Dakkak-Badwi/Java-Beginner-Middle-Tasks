package tag09.girokonto;

public class Konto {

    private String kontonummer;
    private double kontostand;

    public Konto() {
        kontonummer = "Unbekannt";
        kontostand = 0;
    }

    public Konto(String kontonummer, double kontostand) {
        this.setKontonummer(kontonummer);
        this.setKontostand(kontostand);
    }

    public String getKontonummer() {
        return kontonummer;
    }

    public void setKontonummer(String kontonummer) {
        if (kontonummer != null && !kontonummer.trim().isEmpty()) {
            this.kontonummer = kontonummer;
        } else {
            System.out.println("❤️'Kontonummer' \t\t**❤ darf nicht leer oder null sein." + "Standardwert 'Unbekannt' wird verwendet.");
            this.kontonummer = "Unbekannt";
        }
    }

    public double getKontostand() {
        return kontostand;
    }

    public void setKontostand(Double kontostand) {
        if (kontostand == null || kontostand.isNaN()) {
            System.out.println
                    ("❤️'Kontostand' \t\t\t\t**❤ darf nicht leer, oder null sein." +
                            "Standardwert 0.0 wird verwendet.");
            this.kontostand = 0.0;
        } else {
            this.kontostand = kontostand;
        }
    }

    public void einzahlen(double betrag) {
        if (betrag > 0) {
            this.kontostand += betrag;
            System.out.printf("✅ %.2f EUR wurden eingezahlt. Neuer Kontostand: %.2f EUR%n", betrag, this.kontostand);
        } else {
            System.out.println("❌ Einzahlungsbetrag muss positiv sein.");
        }
    }

    public void auszahlen(double betrag) {
        if (betrag > 0 && this.kontostand >= betrag) {
            this.kontostand -= betrag;
            System.out.printf("✅ %.2f EUR wurden ausgezahlt. Neuer Kontostand: %.2f EUR%n", betrag, this.kontostand);
        } else {
            System.out.println("❌ Auszahlung fehlgeschlagen. Betrag ungültig oder nicht genügend Guthaben.");
        }
    }

    public String toString() {
        return String.format("KontoNr.: \t\t%s%n"
                        + "Kontostand: \t%.2f EUR\n"
                ,getKontonummer(), getKontostand()
        );
    }
}
