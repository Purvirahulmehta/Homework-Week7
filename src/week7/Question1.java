package week7;
//Write a java program that tells us that Input number is odd or even?
//HINT: use ternary operator (? :)

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
      //  System.out.println("Please enter a number :");
       // int number = scan.nextInt();
        System.out.println(Test());
       // Question1.Test();
        // String s = " even";

        // String strOutput = (number % 2 == 0) ?" even" : "odd";
        //System.out.println(number + " is " + strOutput);
        //scan.close();

    }
//with return no parameters method

    public static String Test( ) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number :");
        int number = scan.nextInt();

        String strOutput = (number % 2 == 0) ? "  is even number" : "is odd number";

        return strOutput;


    }


}
