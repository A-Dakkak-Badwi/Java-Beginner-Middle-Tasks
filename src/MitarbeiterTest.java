package tag08;

import tools.Tools;

public class MitarbeiterTest {
    public static void main(String[] args) {

        test1();
//        test2();
    }

    private static void test1() {

        System.out.println("\n=== Test 1: Individuelle Setter-Tests ===");
        Mitarbeiter mitarbeiter1 = new Mitarbeiter();
        System.out.println(mitarbeiter1 + "\n");

        System.out.println("=== Test 2: Individuelle Setter-Tests ===");
        Mitarbeiter mitarbeiter2 = new Mitarbeiter(
                "1234", "", "");
        mitarbeiter2.setGehalt(75000.0);
        mitarbeiter2.setErfahrungsjahre(10);
        System.out.println(mitarbeiter2 + "\n");

        System.out.println("=== Test 3: Individuelle Setter-Tests ===");

        Mitarbeiter mitarbeiter3 = new Mitarbeiter
                ("1234", "Max Mustermann", "Entwickler", 75000.0, 5);
        System.out.println(mitarbeiter3 + "\n");

        System.out.println("=== Test 4: Individuelle Setter-Tests ===");

        Mitarbeiter mitarbeiter4 = new Mitarbeiter
                (" ", "John Doe", "Designer", -50000.0, 1);
        System.out.println(mitarbeiter4 + "\n");

        System.out.println("=== Test 5: Individuelle Setter-Tests ===");
        Mitarbeiter mitarbeiter5 = new Mitarbeiter();
        mitarbeiter5.setMitarbeiterID(null);
        mitarbeiter5.setName("John Doe");
        mitarbeiter5.setPosition("Designer");
        mitarbeiter5.setGehalt(-1000.0);
        mitarbeiter5.setErfahrungsjahre(-2);
        System.out.println(mitarbeiter5 + "\n");
    }

    private static void test2() {

        String mitarbeiterID;
        while (true) {
            mitarbeiterID = Tools.textEingeben("Geben Sie die MitarbeiterID ein:");
            if (mitarbeiterID != null && !mitarbeiterID.trim().isEmpty()) {
                break;
            } else {
                Tools.ausgeben("Warnung: MitarbeiterID darf nicht leer oder null sein.");
            }
        }

        String name;
        while (true) {
            name = Tools.textEingeben("Geben Sie den Namen ein (nur Buchstaben):");
            if (name != null && name.matches("[a-zA-Z ]+")) {
                break;
            } else {
                Tools.ausgeben("Warnung: Name darf nur Buchstaben und Leerzeichen enthalten.");
            }
        }

        String position;
        while (true) {
            position = Tools.textEingeben("Geben Sie die Position ein (nur Buchstaben):");
            if (position != null && position.matches("[a-zA-Z ]+")) {
                break;
            } else {
                Tools.ausgeben("Warnung: Position darf nur Buchstaben und Leerzeichen enthalten.");
            }
        }

        double gehalt;
        while (true) {
            String gehaltEingabe = Tools.textEingeben("Geben Sie das Gehalt ein (nur Zahlen):");
            if (gehaltEingabe != null && gehaltEingabe.matches("\\d+(\\.\\d+)?")) {
                gehalt = Double.parseDouble(gehaltEingabe);
                if (gehalt >= 0.0) {
                    break;
                } else {
                    Tools.ausgeben("Warnung: Gehalt darf nicht negativ sein.");
                }
            } else {
                Tools.ausgeben("Warnung: Gehalt muss eine gültige Zahl sein.");
            }
        }

        int erfahrungsjahre;
        while (true) {
            String erfahrungEingabe = Tools.textEingeben("Geben Sie die Erfahrungsjahre ein (nur Zahlen):");
            if (erfahrungEingabe != null && erfahrungEingabe.matches("\\d+")) {
                erfahrungsjahre = Integer.parseInt(erfahrungEingabe);
                if (erfahrungsjahre >= 0) {
                    break;
                } else {
                    Tools.ausgeben("Warnung: Erfahrungsjahre dürfen nicht negativ sein.");
                }
            } else {
                Tools.ausgeben("Warnung: Erfahrungsjahre müssen eine gültige Zahl sein.");
            }
        }

        Mitarbeiter mitarbeiter = new Mitarbeiter(mitarbeiterID, name, position, gehalt, erfahrungsjahre);

        Tools.ausgeben("=== Mitarbeiter-Daten ===\n" + mitarbeiter.toString());
    }
}
