package com.helloworld;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroceryListManager {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<String>  grocerylist =new ArrayList<>();
        System.out.println("Welcome to the Grocery List Manager!");
        System.out.println("Please choose an option:");
        System.out.println("1. Add an item");
        System.out.println("2. Remove an item");
        System.out.println("3. Print the list");
        System.out.println("4. Check if an item is on the list");
        System.out.println("5. Clear the list");
        System.out.println("6. Exit");
        int choice = 0;
        do {
            System.out.print("Enter your choice:");
            choice = Scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the item name: ");
                    String item = Scanner.next();
                    groceryList.add(Item);
                    System.out.println(item + " added to the list.");
                    break;
                case 2:
                    System.out.print("Enter the item name: ");
                    item = scanner.next();
                    boolean removed = groceryList.remove(Item);
                    if (removed) {
                        System.out.println(item + " removed from the list.");
                    } else {
                        System.out.println(item + " not found on the list.");
                    }
            }
            case 3:
                System.out.println("The current grocery list is:");
                for (String s : groceryList) {
                    System.out.println(s);


                }
                break;
            case 4:
                System.out.print("Enter the item name: ");
                item = scanner.next();
                boolean contains = groceryList.contains(item);
                if (contains) {
                    System.out.println("The item is on the list :");
                } else {
                    System.out.println("The item is not on the list :");
                }
                break;

            case 5:
                groceryList.clear();
                System.out.println("The List has been cleared");
                break;
            case 6:
                System.out.println("Thank you for using the Grocery list manager");
                break;
            default:
                System.out.println("Invalid choice!Please try again");
        }


        }
        while(choice!=6);
        scanner.close();
    }
}
