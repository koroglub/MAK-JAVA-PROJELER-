
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
public class example4 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" alt sınırı gir :");
        int alt_sinir= input.nextInt();
        System.out.println("üst sınırı girin");
        int üst_sinir = input.nextInt();
        for(int i = alt_sinir; i <= üst_sinir; i++)
        {
        if(i%3==0 || i %4==0)
                System.out.println(i);
        }
    }
    
}
