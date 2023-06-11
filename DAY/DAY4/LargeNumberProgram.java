package com.helloworld;
import java.util.Scanner;

public class LargeNumberProgram {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integer values");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        input.close();
        if(num1>num2){
            System.out.println("The larger value is:"+num1);}
        else if(num1<num2){
            System.out.ln("The larger value is:"+num2);}
        else{
            System.out.println("The values are equal");

        }


    }

}
