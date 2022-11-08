
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
public class example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new  Scanner(System.in);
        int sayı;
        do {
            System.out.println(" sıfır ile yüz arasında bir sayı giriniz:");
            sayı = input.nextInt();
        } while (sayı >100 || sayı <0);
        System.out.println("girilen sayı:"+ sayı);
    }
    
}
