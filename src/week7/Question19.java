package week7;
//Write a Java program to calculate the average value of array elements.

public class Question19 {
    public static void main(String[] args) {
        int [] numbers =new int[] {10,20,30,40,50,60};
        int sum =0;
        for (int i =0; i< numbers.length ; i++)
            sum = sum + numbers[i];
        double average = sum/numbers.length;
        System.out.println("Average value of the array element is : " + average);

    }

}
