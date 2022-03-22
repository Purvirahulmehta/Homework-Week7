package week7;
//Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
//“ZERO”

import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter a Number");
        number = scanner.nextInt();
        scanner.close();
        if (number > 0)
            System.out.println("This is Positive Number");
        else if (number < 0)
            System.out.println("This is Negetive Number");
        else
            System.out.println("This is Zero Number");

    }
}
