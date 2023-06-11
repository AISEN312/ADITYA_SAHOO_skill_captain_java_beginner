package com.helloworld;
import java.util.Scanner;

public class ArithmeticCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to CLI Calculator");
        boolean quit = false;
        while(!quit){
            System.out.println("Enter the first number:");
            double num1 = input.nextDouble();
            System.out.println("Enter the second number:");
            double num2 = input.nextDouble();
            System.out.println("Enter the operation (+, -, *, /):");
            char op = input.next().charAt(0);
            switch(op){
                case '+':
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case '-':
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case '*':
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                case '/':
                    if(num2==0){
                        System.out.println("Cannot divide by zero");
                    }else{
                        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    }
                    break;
                default:
                    System.out.println("Invalid operation.");}
            System.out.println("Do you want to continue? (y/n)");
            char choice = input.next().charAt(0);
            if(choice == 'n'  || choice == 'N'){
                quit = true;
                System.out.println("Thank you for using the CLI Calculator");
            }



        }
        input.close();
    }

}