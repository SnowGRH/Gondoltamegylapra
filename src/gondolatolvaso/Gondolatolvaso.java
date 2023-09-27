package gondolatolvaso;

import java.util.Scanner;

public class Gondolatolvaso {

    public static void main(String[] args) {
        String[] pakli = Oszetesz();
        for (int i = 0; i < 3; i++) {
            Kirak(pakli);
            int oszlop = Melyik();
            pakli = Kever(pakli, oszlop);
        }

        EzVolt(pakli);
    }

    private static void Kirak(String[] lapok) {
        for (int i = 1; i < lapok.length; i++) {
            System.out.printf("%-10s", lapok[i]);
            if (i % 3 == 0) {
                System.out.println("");
            }
        }

    }

    public static String[] Oszetesz() {
        String[] pakli = new String[22];
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
        int j = 1;
        for (String szin : szinek) {
            for (int i = 0; j < 22 && i < ertek.length; i++) {
                pakli[j++] = ertek[i] + "." + szin;
            }
        }
        return pakli;
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

    public static String[] Kever(String[] lapok, int bekert) {
        String[] ujPakli = new String[lapok.length];
        switch (bekert) {
            case 1:
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = lapok[20 - (i - 1) * 3];
                    ujPakli[i + 7] = lapok[19 - (i - 1) * 3];
                    ujPakli[i + 14] = lapok[21 - (i - 1) * 3];

                }
                for (int i = 1; i < ujPakli.length; i++) {
                    if (i % 3 == 1) {
                        System.out.println("");
                    }
                    System.out.printf("%-8s", ujPakli[i]);
                }
                break;
            case 2:
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = lapok[19 - (i - 1) * 3];
                    ujPakli[i + 7] = lapok[20 - (i - 1) * 3];
                    ujPakli[i + 14] = lapok[21 - (i - 1) * 3];

                }
                for (int i = 1; i < ujPakli.length; i++) {
                    if (i % 3 == 1) {
                        System.out.println("");
                    }
                    System.out.printf("%-8s", ujPakli[i]);
                }
                break;

            case 3:

                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = lapok[20 - (i - 1) * 3];
                    ujPakli[i + 7] = lapok[21 - (i - 1) * 3];
                    ujPakli[i + 14] = lapok[19 - (i - 1) * 3];
                }

                for (int i = 1; i < ujPakli.length; i++) {
                    if (i % 3 == 1) {
                        System.out.println("");
                    }
                    System.out.printf("%-8s", ujPakli[i]);
                }
                break;
        }
        return ujPakli;

    }

    public static void EzVolt(String[] lap) {
        System.out.printf("A kiválasztott kártya ez volt:", lap[11]);
    }

}
