package week7;
//Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
//any other alphabet should be invalid entry
//9. Same as above program-8 using switch statement.
import java.util.Scanner;
public class Question9 {



public static void main(String[] args) {
        char ch;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any alphabet");
        ch = scan.next().charAt(0);
        Question9.alphabets(ch);
        }
public static char alphabets(char ch) {
        char c;

        switch (ch) {
        case 'a':
        System.out.println("Anand");
        break;
        case 'b':
        System.out.println("Baroda");
        break;
        case 'c':
        System.out.println("Calcutta");
        break;
        case 'd':
        System.out.println("Daman");
        break;
        case 'e':
        System.out.println("Ealing");
        break;
        case 'f' :
        System.out.println("Fatehpur");
default:
        System.out.println("Invalid entry");
        }
        return ch;
        }
        }





