package com.helloworld;
import java.util.Scanner;
public class dw{
     public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         int num = 0;
         do {
             System.out.println("Please enter a number between 1 and 10:");
             num = input.nextInt();
             if (num < 1 || num > 10) {
                 System.out.println("Invalid number. Try again.");
             }
         }while(num <  1 || num > 10);
             input.close();
             System.out.println("You enter no."+ num +".");
         }

    }


