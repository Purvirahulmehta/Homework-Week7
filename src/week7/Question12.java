package week7;

import java.util.Scanner;

//Write a program that tells us input value is number or an alphabet or symbol.
public class Question12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any charcter :");
        char ch = scan.next().charAt(0);
        if (ch >= '0' && ch <='9') {
            System.out.println(ch + " is a number");
        }else if ((ch >= 'a' && ch <='z') || (ch >= 'A' && ch <= 'Z')) {
           System.out.println(ch + "is an alphabet");
        }
        else {
            System.out.println(ch + "is a symbol");
        }

    }
}
