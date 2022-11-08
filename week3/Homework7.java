
import java.util.Scanner;


public class Homework7 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir a sayısı giriniz:");
        int a = input.nextInt();
        int b =0;
        int k =0;
        if ( a > 0 )
        {
        k = a /=10;
        b=b*10+k;
        a=a/10;
            System.out.println(k + b+a);
        }
        else
        {
            System.out.println(b);
        }
       
    }
    
}
