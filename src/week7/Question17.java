package week7;
//Write a Java program to sort a numeric array and a string array.

import java.util.Arrays;

public class Question17 {
    public static void main(String[] args) {
        int [] arraydata1 = {1,2,3,4,5,6,7,8,9,10};
        String[] arraydata2 = {"Mango","Banana","Grapes","Apple","Plum","Chicuoo","Sugercane","Strwabery"," Blackcurrent","Fruit"};
        System.out.println("Orginal value ; " + Arrays.toString(arraydata1));
        Arrays.sort(arraydata1);
        System.out.println("Sorted Value : " + Arrays.toString(arraydata2));
        Arrays.sort(arraydata2);
        System.out.println("Sorted Value : " + Arrays.toString(arraydata2));
    }


}
