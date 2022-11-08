/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bahar
 */
import java.util.Scanner;
public class example1 {

   
    
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
       System.out.println("bie sayi gir");
       int N= input.nextInt();
        int S= 1;
        int tek_toplam=0;
        int çift_toplam=0;
       
       while(S<=N)
       {
            if(S%2 != 0)
            {
                tek_toplam = tek_toplam+S; 
            }
            else{
            
                çift_toplam = çift_toplam+S;
            }
            S= S+1;
           
            } System.out.println("çift_toplam:"+çift_toplam + "tek_toplam:" +tek_toplam);
       }
    
}
      
    
    
    
    
    
