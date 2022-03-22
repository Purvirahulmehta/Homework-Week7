package week7;
//Write a java program to input any number and find out if it’s odd or even

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = scan.nextInt();
        int test = scan.nextInt();

    }
    public static void test(){
        int number = 0;
        if (number % 2 == 0)
            System.out.println(number + "is even");
        else
            System.out.println(number + " is odd");

    }

}
