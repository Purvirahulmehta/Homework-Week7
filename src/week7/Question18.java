package week7;
//Write a Java program to sum values of an array.

public class Question18 {
    public static void main(String[] args) {
        int [] myarray = {5,8,10,9,72,58,92};
        int sum = 0;
        for (int i : myarray){
            sum +=i;
            System.out.println("The sum is : " + sum);
        }
    }
}
