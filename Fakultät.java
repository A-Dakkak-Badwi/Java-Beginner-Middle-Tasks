package tag05;

import java.util.Scanner;

public class Fakultät {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Bite Geben Sie ein zahl ein: \n ");
        long zahl = in.nextLong();

        if (zahl < 1) {
            System.err.println("Fakultätrn Sind immer >=1 ");
        } else {
            long zähler = zahl;
            long teiler = 2;
            while (zähler % teiler == 0) {
                zähler = zähler / teiler;
                teiler++;
            }
            if (zähler == 1) {
                System.out.println("Der zahl eine fakultät zahl");
            } else {
                System.out.println("Der zahl ist keine fakultät zahl ");
            }

        }
    }
}