


import java.util.Scanner;
public class example2 {

 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen fahrenheit derecesi:");
        double fahrenheit = input.nextDouble();
        double celcius = ( fahrenheit-32)/ 1.8;
        System.out.println("Celcuis derecesi:" +celcius);
        
    }
    
}
