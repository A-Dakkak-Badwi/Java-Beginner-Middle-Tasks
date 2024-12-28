package tag09;

public class Girokonto extends Konto {

    private double limit;

    public Girokonto() {
        super();
        this.limit = 0;
    }

    public Girokonto(String kontonummer, double kontostand, double limit) {
        super(kontonummer, kontostand);
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public void auszahlen(double betrag) {
        if (betrag > 0 && (this.getKontostand() - betrag) >= -this.limit) {
            this.setKontostand(this.getKontostand() - betrag);
            System.out.printf("✅ %.2f EUR wurden ausgezahlt. Neuer Kontostand: %.2f EUR%n", betrag, this.getKontostand());
        } else {
            System.out.println("❌ Auszahlung fehlgeschlagen. Betrag übersteigt das Kreditlimit.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Limit: \t\t%.2f EUR%n", this.limit);
    }
}
