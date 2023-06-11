package com.helloworld;

public class AgeAndNameProgram {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();
        input.nextLIne();
        System.out.println("Enter your name");
        String name = input.nextLine();
        input.close();
        System.out.println("Hello" + name + "! You are" + age + "years old");
    }
}
