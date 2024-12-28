package tag09;

import tag09.Konto;

public class Bruch extends Konto {
    private int zaehler;
    private int nenner;

    public Bruch() {
        super();
        this.zaehler = 0;
        this.nenner = 1;
    }

    public Bruch(int zaehler) {
        this.zaehler = zaehler;
        this.nenner = 1;
    }

    public Bruch(int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    public void setZaehler(int z) {
        zaehler = z;
    }

    public void setNenner(int n) {
        nenner = n;
    }

    public int getZaehler() {
        return zaehler;
    }

    public int getNenner() {
        return nenner;
    }

    public void ausgeben() {
        System.out.print(zaehler + "/" + nenner);
    }

    public Bruch addiere(Bruch b) {
        int neuerZaehler = this.zaehler * b.nenner + b.zaehler * this.nenner;
        int neuerNenner = this.nenner * b.nenner;
        Bruch rueckgabe = new Bruch(neuerZaehler, neuerNenner);
        rueckgabe.kuerzen();
        return rueckgabe;
    }

    public Bruch subtrahiere(Bruch b) {
        int neuerZaehler = this.zaehler * b.nenner - b.zaehler * this.nenner;
        int neuerNenner = this.nenner * b.nenner;
        Bruch rueckgabe = new Bruch(neuerZaehler, neuerNenner);
        rueckgabe.kuerzen();
        return rueckgabe;
    }

    public double dezimalwert() {
        return (double) zaehler / nenner;
    }

    public String bruchToString() {
        return zaehler + "/" + nenner;
    }

    public void kuerzen() {
        int m, n, r;
        m = Math.abs(zaehler);
        n = Math.abs(nenner);
        r = m % n;
        while (r > 0) {
            m = n;
            n = r;
            r = m % n;
        }
        zaehler /= n;
        nenner /= n;
    }

    public void gekuerztAusgeben() {
        kuerzen();
        ausgeben();
    }

    public boolean equals(Bruch x) {
        var a = new Bruch(this.zaehler, this.nenner);
        var b = new Bruch(x.zaehler, x.nenner);
        a.kuerzen();
        b.kuerzen();
        if ((a.zaehler == b.zaehler) && (a.nenner == b.nenner)) {
            return true;
        } else {
            return false;
        }
    }
}