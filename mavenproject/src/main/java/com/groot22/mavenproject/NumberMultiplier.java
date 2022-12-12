package com.groot22.mavenproject;
import java.util.*;

public class NumberMultiplier {
   public static void main(String[] args) {
   

      Scanner scan = new Scanner(System.in);

      System.out.println("Enter a number to multiply with 6: ");
      while(!scan.hasNextDouble()) {
          scan.next();
          System.out.println("enter a number");
      }
      double multiplier = scan.nextDouble();

      System.out.println(multiplier +" x 6: "+multiply(multiplier));
   
   }
   public static double multiply(double multiplier)
   {
   
      double result = multiplier * 6;
      return result;
   }
   
}