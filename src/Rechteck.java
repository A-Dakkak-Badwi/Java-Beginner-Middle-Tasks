package tag07;

public class Rechteck {
    private double laenge;
    private double breite;

    public Rechteck() {
        laenge = 0;
        breite = 0;
    }

    public Rechteck(double laenge, double breite) {
        setSeiten(laenge, breite);
    }

    public double getLaenge() {
        return laenge;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    public double getBreite() {
        return breite;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    public double getFlaeche() {
        return laenge * breite;
    }

    public double getUmfang() {
        return 2 * (laenge + breite);
    }

    public double getLangeSeite() {
        return laenge;
    }

    public double getKurzeSeite() {
        return breite;
    }

    public double getDiagonale() {
        return Math.sqrt(Math.pow(laenge, 2) + Math.pow(breite, 2));
    }

    public void setSeiten(double laenge, double breite) {
        if (laenge >= breite) {
            this.laenge = laenge;
            this.breite = breite;
        } else {
            this.laenge = breite;
            this.breite = laenge;
        }
    }

    public void laengeVergroessern(double laenge) {
        this.laenge += laenge;
    }

    public void breiteVergroessern(double breite) {
        this.breite += breite;
    }

    public void laengeVerkleinern(double laenge) {
        this.laenge -= laenge;
    }

    public void breiteVerkleinern(double breite) {
        this.breite -= breite;
    }

    public void laengeAusgaben() {
        System.out.println("Länge: " + laenge);
    }

    @Override
    public String toString() {
        return String.format("Lange Seite: \t\t%.2f\n"
                        + "Kurze Seite: \t\t%.2f\n"
                        + "Fläche: \t\t\t%.2f\n"
                        + "Umfang: \t\t\t%.2f\n"
                        + "Diagonale: \t\t\t%.2f\n"
                        + "Hinweis: \t\t\tLange Seite ist %.2f, kurze Seite ist %.2f\n",
                getLangeSeite(), getKurzeSeite(), getFlaeche(), getUmfang(), getDiagonale(),
                getLangeSeite(), getKurzeSeite()
        );
    }
}