
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
public class example5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("satır sayısını girin:");
        int a=input.nextInt();
        System.out.println("sütun sayısını girin:");
        int b=input.nextInt();
        for (int i = 1; i <=a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
    
}
