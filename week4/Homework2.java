
import java.util.Scanner;


public class Homework2 {

   
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int N= input.nextInt();
        int S=1;
        int t1=0;
        int t2=0;
        int t3=0;
      
        while(S<=N)
        {
            if(S%2!=0)
            {
            t1=t1+S;
            }
            else
            {
            t2=t2+S;
            }
            t3=t3+S;
            S=S+1;
            
        }
   System.out.println("t1:" +t1 );
            System.out.println("t2:" +t2);
            System.out.println("t3:" +t3);
       
            
        }
    }

    
    

