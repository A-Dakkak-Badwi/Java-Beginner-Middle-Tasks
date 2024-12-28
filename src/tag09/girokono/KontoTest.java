package tag09.girokonto;

public class KontoTest {
    public static void main(String[] args) {

//        test1();
//        kontoTest();
        girokontoTest();
    }

    private static void test1() {
        Konto konto = new Konto();
        System.out.println("k = \n" + konto);
        System.out.println("##################################");

        Konto konto1 = new Konto("0000000001", 1000);
        System.out.println("k2 = \n" + konto1);
        System.out.println("##################################");
    }

    private static void kontoTest() {
        Konto konto2 = new Konto("0000000001", 1000.00);

        System.out.println("k3 = \n" + konto2);

        konto2.einzahlen(500.00);
        System.out.println(konto2.getKontostand());

        konto2.auszahlen(750.50);
        System.out.println(konto2.getKontostand());

        konto2.auszahlen(750.50);
        System.out.println(konto2.getKontostand());
    }

    private static void girokontoTest() {

        Girokonto gk = new Girokonto("0000000001", 10000.0, 1000.0);
        gk.auszahlen(11000.0);
        System.out.println("Kontostand: " + gk.getKontostand());
        gk.einzahlen(11000.0);
        gk.auszahlen(11000.0);
        gk.auszahlen(11001.0);
        System.out.println("Kontostand: " + gk.getKontostand());
    }
}
