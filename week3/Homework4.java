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
public class Homework4 {

    
    public static void main(String[] args) {
      Scanner input= new Scanner(System.in);
      System.out.println("bir sayi gir");
      int sayi = input.nextInt();
      if(sayi==1)
      {
          System.out.println("bugün günlerden pazartesi");
          
      }
      if(sayi==2)
      {
          System.out.println("bügün günlerden salı");
      }
      if(sayi==3)
      {
          System.out.println("bugün günlerden çarşamba");
      }
      if(sayi==4)
      {
          System.out.println("bugün günlerden perşembe");
      }
      if(sayi==5)
      {
          System.out.println("bugün günlerden cuma");
      }
      if(sayi==6)
      {
          System.out.println("bugün günlerden cumartesi");
      }
      if(sayi==7)
      {
          System.out.println("bugün  günlerden pazar");
      }
      if(sayi>7)
      {
          System.out.println("bu sayıya göre bir gün yok");
      }
      if(sayi<0)
      {
          System.out.println("bu sayıya göre bir gün yok");
      }
    }
    
}
