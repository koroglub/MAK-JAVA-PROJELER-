
import java.util.Scanner;


public class Homework3 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("n sayisini giriniz:");
        int n = input.nextInt();
        System.out.println("r sayisini giriniz:");
        int r = input.nextInt();
        int f1 = 1;
        int f2 = 1;
        int f3 = 1;
        int k =1;
        for(int i=1; i<=n; i++)
        { 
            f1=f1*i;
            if(i<=r)
            {
            f2=f2*i;
            }
            if(i<= n-r)
            {
            f3=f3*i;
            }
                    k = f1/(f2*f3);
        }    

        System.out.println("kombinasyon:" + k);
    } 
    
}
