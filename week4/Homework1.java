
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
public class Homework1 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı girin");
        int N = input.nextInt();
        
        
        for( int S=1; S<= N;S++)
        {
        if(N%S==0)
            
        {
        System.out.println(S);
        }
          
        }
         
       
    } 
    
}
