package tag04;
import util.Tools;

public class DateiGrößenBerechnen {
    public static void main(String[] args) {
        dateiGrossenEingeben();
    }

    public static void dateiGrossenEingeben() {
        int anzahl = Tools.zahlEingeben("Gib die Anzahl der Dateien ein:");
        double gesamtgrosse = 0.0;

        for (int i = 0; i < anzahl; i++) {
            int große = Tools.zahlEingeben("Gib die Größe der Datei " + i + " in KB ein ");
            gesamtgrosse += große;
        }

        double megabyte = gesamtgrosse / 1024.0;
        double gigabyte = megabyte / 1024.0;

        String ausgabe = "Die Gesamtgröße der Dateien beträgt :  \n "
                + gesamtgrosse + "KB \n"
                + String.format("%.2f MB \n", megabyte)
                + String.format("%.2f GB \n", gigabyte);
        Tools.ausgeben(ausgabe);
    }
}
