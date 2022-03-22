package week7;
//10.Write a java program to input any two number and ask user to enter their symbol (+, -,
///, *) find addition, Subtraction, multiplication and division according to their symbol
//(using if else)

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch;
        System.out.println("Enter the First Number :");
        int num1 = scanner.nextInt();
        System.out.println("Enter the Second Number");
        int num2 = scanner.nextInt();
        System.out.println("Enter the sign you want(+,-,*,/);");
        ch = scanner.next().charAt(0);
        if (ch == '+') {
            System.out.println("Addition of " + num1 + " +" + num2 + " =" + (num1 + num2));
        } else if (ch == '-') {
            System.out.println("Substraction of " + num1 + " -" + num2 + " =" + (num1 - num2));
        } else if (ch == '*') {
            System.out.println("Multiplication of " + num1 + " *" + num2 + " =" + (num1 * num2));
        } else {
            System.out.println("Division of " + num1 + " /" + num2 + " =" + (num1 / num2));
        }
    }
}