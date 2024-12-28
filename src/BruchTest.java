package tag09;

public class BruchTest {
    public static void main(String[] args) {
        Bruch bruch = new Bruch(3, 4);
        Bruch bruch2 = new Bruch(1, 6);
        Bruch ergebnis = bruch.addiere(bruch2);
        ergebnis.ausgeben();
        ergebnis = bruch.subtrahiere(bruch2);
        ergebnis.ausgeben();
    }
}