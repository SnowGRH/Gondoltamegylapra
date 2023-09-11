package gondolatolvaso;

import java.util.Scanner;

public class Gondolatolvaso {

    static String[] pakli = new String[22];

    public static void main(String[] args) {
        Kirak();
        Kever();
        EzVolt();
    }

    public static void Kirak() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
        int j = 1;
        for (String szin : szinek) {
            for (int i = 0; j < 22 && i < ertek.length; i++) {
                pakli[j++] = ertek[i] + "." + szin;
            }
        }

        for (int i = 1; i < pakli.length; i++) {
            if (i % 3 == 1) {
                System.out.println("");
            }
            System.out.printf("%-8s", pakli[i]);
        }
        System.out.println("\n");
    }

    public static int Melyik() {
        Scanner sc = new Scanner(System.in);
        System.out.println("melyik oszlop (1-3) : ");
        int oszlop = sc.nextInt();
        while (oszlop < 1 || oszlop > 3) {
            System.out.println("melyik oszlop (1-3) : ");
            oszlop = sc.nextInt();
        }
        return oszlop;

    }

    public static void Kever() {
        int bekert = Melyik();
        int a;
        int b;
        int c;
        String[] tomb = new String[22];
        switch (bekert) {
            case 1:
                for (int i = 1; i <= 7; i++) {
                    tomb[i] = pakli[20 - (i - 1) * 3];
                    tomb[i + 7] = pakli[19 - (i - 1) * 3];
                    tomb[i + 14] = pakli[21 - (i - 1) * 3];

                }
                for (int i = 1; i < tomb.length; i++) {
                    if (i % 3 == 1) {
                        System.out.println("");
                    }
                    System.out.printf("%-8s", tomb[i]);
                }
                break;
            case 2:
                for (int i = 1; i <= 7; i++) {
                    tomb[i] = pakli[19 - (i - 1) * 3];
                    tomb[i + 7] = pakli[20 - (i - 1) * 3];
                    tomb[i + 14] = pakli[21 - (i - 1) * 3];

                }
                for (int i = 1; i < tomb.length; i++) {
                    if (i % 3 == 1) {
                        System.out.println("");
                    }
                    System.out.printf("%-8s", tomb[i]);
                }
                break;

            case 3:

                for (int i = 1; i <= 7; i++) {
                    tomb[i] = pakli[20 - (i - 1) * 3];
                    tomb[i + 7] = pakli[21 - (i - 1) * 3];
                    tomb[i + 14] = pakli[19 - (i - 1) * 3];
                }

                for (int i = 1; i < tomb.length; i++) {
                    if (i % 3 == 1) {
                        System.out.println("");
                    }
                    System.out.printf("%-8s", tomb[i]);
                }
                break;
        }
    }

    public static void EzVolt() {

    }

}
