package com.helloworld;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;


public class UniqueNumberChecker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Set<Integer> numberSet = new HashSet<>();
        System.out.println("Enter a series of numbers, one at a time. Enter -1 to stop.");
        int number = 0;
        while(number!= -1){
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            boolean contains = numberSet.contains(number);
            if(contains){
                System.out.println(number + " is a duplicate.");


            }else{
                System.out.println(number + " is unique.");
                numberSet.add(number);

            }
            System.out.println("Thank you for using the Unique Number Checker!");
            scanner.close();
        }

    }
}
