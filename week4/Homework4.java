
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
public class Homework4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("x'i girin:");
        int x= input.nextInt();
        int fx= x^2-5*x+3;
        
        if(fx <0)
        {
            System.out.println("-1");
        }
        if(fx==0)
        {
            System.out.println("0");
        }
        if(fx>0)
        {
            System.out.println("1");
        }
    }
    
}
