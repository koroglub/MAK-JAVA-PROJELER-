
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bahar
 */
public class example3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println(" b sayısını giriniz:");
        int b= input.nextInt();
        for (int a = 1; a <=99; a++) {
            if (a*a*a - a*a == b ) {
                System.out.println(a +"a:");
            }
            
        }
        
    }
    
}
