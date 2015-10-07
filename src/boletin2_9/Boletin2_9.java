
package boletin2_9;

import java.util.Scanner;


public class Boletin2_9 {

   
    public static void main(String[] args) {
       float gCent, gFahren, gKelvin;
        Scanner obx= new Scanner(System.in);
        System.out.println("introduce temperatura en grados centigrados : ");
        gCent=obx.nextFloat();
        gFahren=(float) (1.8* gCent + 32);
        gKelvin=(float) (gCent + 273.15);
        System.out.println(gCent+"grados centigrados equivalen a : "+ gFahren +" grados Fahrenheit y a : "+gKelvin + "grados Kelvin" );
    }
    
}
