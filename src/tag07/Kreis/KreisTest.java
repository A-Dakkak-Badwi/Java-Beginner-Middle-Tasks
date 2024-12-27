package tag07.kreis;

import tools.Tools;


public class KreisTest {
    public static void main(String[] args) {
//        test1();
//        test2();
        test3();
    }

    private static void test1() {

        Kreis kreis = new Kreis();
        System.out.println(kreis);

        Kreis kreis2 = new Kreis(10.0);
        Kreis kreis3 = new Kreis(2.2);
        System.out.println(kreis2);
    }

    private static void test2() {
        double radius = Tools.kommazahlEingeben("Bitte gib ein Radius für den Kreis ein: ");
        Kreis kreis = new Kreis(radius);
        Tools.ausgeben(kreis.toString());

    }


    private static void test3() {

        Kreis kreis = new Kreis();
        double umfang = 31.42;
        double flaeche = 78.54;

        kreis.setRadiusByUmfang(umfang);

        System.out.println("\n________________Kreis_______________");
        System.out.println("************************************");

        System.out.println("Eingegebener Umfang: \t\t\t" + umfang);
        System.out.println("____________________________________");

        System.out.println(kreis);

        System.out.println("#(●'◡'●)(❁´◡`❁)#❤️#(❁´◡`❁)(●'◡'●)#");

        kreis.setRadiusByFlaeche(flaeche);
        System.out.println("Eingegebene Fläche: \t\t\t" + flaeche);
        System.out.println("____________________________________");


        System.out.println(kreis);
        System.out.println("************************************");


//        Tools.ausgeben(kreis.toString());


    }

}
