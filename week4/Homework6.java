
import java.util.Scanner;


public class Homework6 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz:");
        int S = input.nextInt();
       System.out.println("girdiğiniz sayının tersi:"); 
        while(S>0)
        {
            System.out.println(S%10);
            S/=10;
            
        
        }
         
       
    }
    
}
