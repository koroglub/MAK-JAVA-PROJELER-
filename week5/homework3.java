
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
public class homework3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println(" bir sayı giriniz:");
        int sayi = input.nextInt();
        for (int i = sayi; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
    
}
