
import java.util.Scanner; // java'nın util kütüphanesine ait Scanner class'ı import edildi
public class Excample1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);// konsoldan değer almak için tanımladık
        System.out.println("Lütfen km cinsinden değer giriniz:");
        int km = input.nextInt();
        int metre = km * 1000; 
        System.out.println("hesaplanan metre:" + metre);
        
    }}
   
           
           
          
    
   
   
   

