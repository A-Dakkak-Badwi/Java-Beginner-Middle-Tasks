package tag04;
import tools.Tools;

public class DateiGrößenBerechnenErweiterungBeenden {
    public static void main(String[] args) {
        String wiederholen = "";
        do {
            DateiGrößenBerechnen.dateiGrossenEingeben();
            wiederholen = Tools.textEingeben("Möchtest du das Programm wiederholen ? ja/ nein");
        } while (wiederholen != null && wiederholen.equalsIgnoreCase("ja"));
        Tools.ausgeben("Das Programm wird beendet.");
    }
}

