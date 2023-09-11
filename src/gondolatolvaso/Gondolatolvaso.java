package gondolatolvaso;
import java.util.Scanner;
public class Gondolatolvaso {

    static String[] pakli = new String[21];
    
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
            for (int i = 0; j < 21 && i<ertek.length; i++) {
                pakli[j++] = ertek[i]+"."+szin;
            }
        }
        
        for(int i=0;i<pakli.length;i++){
            if(i % 3 == 0){
                    System.out.println("");
                }
            System.out.printf("%-8s",pakli[i]);
        }
        System.out.println("\n");
    }
    
    public static int Melyik(){
        Scanner sc = new Scanner(System.in);
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
