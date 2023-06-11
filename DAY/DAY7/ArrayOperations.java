package com.helloworld;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] myArray = new int[5];
        int sum =0;
        double average = 0.0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i =0;i < myArray.length;i++){
            System.out.println("Please enter an integer value:");
            myArray[i] = input.nextInt();
            sum += myArray[i];
            if(myArray[i]>max){
                max = myArray[i];
            }
            if(myArray[i]<min){
                min = myArray[i];
            }
        }
        input.close();
        average = (double)sum/myArray.length;
        System.out.println("The sum of the values is " + sum);
        System.out.println("The average of the values is " + average);
        System.out.println("The maximum of the values is " + max);
        System.out.println("The minimum of the values is " + min);

    }
}
