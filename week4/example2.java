
import java.util.Scanner;



public class example2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı gir:");
        int N= input.nextInt();
         int S = 1;
          int Faktoriyel = 1;
         while(S<=N){
             Faktoriyel*=S;
             S=S+1;
         }
        System.out.println("Faktoriyel:" + Faktoriyel);
        
      
    } 
    
}
