/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gondolatolvaso;

import java.util.Scanner;




public class Gondolatolvaso {

    static Scanner sc = new Scanner(System.in);
    static String[] pakli = new String[22];
    
    public static void main(String[] args) {
        Kirak();
        Melyik();
        Kever();
        EzVolt();
    }
    
    
    public static void Kirak(){
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
        int j = 0;
        for (String szin : szinek) {
            for (int i = 0; j < 22 && i<ertek.length; i++) {
                pakli[j++] = ertek[i]+"."+szin;
            }
        }
        
        for(int i=0;i<pakli.length;i++){
            if(i % 3 == 0){
                    System.out.println("\n");
                }
            System.out.print(pakli[i] + "\t\t");
        }
        System.out.println("\n");
    }
    
    public static int Melyik(){
        
        System.out.println("melyik oszlop (1-3) : ");
        int oszlop = sc.nextInt();
        while(oszlop < 1 || oszlop > 3){
            System.out.println("melyik oszlop (1-3) : ");
            oszlop = sc.nextInt();
        }
        return oszlop;
        
        
    }
    
    public static void Kever(){
        
    }
    
    
    public static void EzVolt(){
        
    }
    
}
