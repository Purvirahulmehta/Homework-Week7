package week7;
//Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
//any other alphabet should be invalid entry


import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        char x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any alphabet to print city name:");
        x = sc.next().charAt(0);
        Question8.alpha(x);
    }

    public static char alpha(char x) {
        if (x == 'A') {
            System.out.println("Anand");
        } else if (x == 'B') {
            System.out.println("Baroda");
        } else if (x == 'C') {
            System.out.println("Calcutta");
        } else if (x == 'D') {
            System.out.println("Daman");
        } else if (x == 'E') {
            System.out.println("East Los Angels");
        } else if (x == 'F') {
            System.out.println("Fatehpur");
        } else {
            System.out.println("Invalid entry ");
        }
        return x;
    }
}
