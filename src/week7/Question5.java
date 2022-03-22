package week7;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter employee ID :");
        int eID = scan.nextInt();
        System.out.println("Enter employee name :");
        String empName = scan.next();
        System.out.println("Enter Basic Salary of the employee :");
        float r = scan.nextFloat();
        float HRA = (r*0.10f);
        float DA = (r*0.08f);
        float TA = (r*0.09f);
        float PF = (r*0.20f);
        float GS = (r + HRA+DA +TA+DA -PF);

        System.out.println("|------------------------------------------|");
        System.out.println("|            SALARY SLIP                   |");
        System.out.println("|------------------------------------------|");
        System.out.println("| Employee ID    :  "  + eID +"    \t\t\t\t|");
        System.out.println("| Employee Name    :" + empName +  "\t\t\t\t|");
        System.out.println("|-------------------------------------------|");
        System.out.println("| Basic Salary  : " + r+           "\t\t\t\t|");
        System.out.println("| HRA 10%  : " + HRA+              "\t\t\t\t|");
        System.out.println("| TA  8%    :" +TA +               "\t\t\t\t|");
        System.out.println("| DA 9%     :" +DA +               "\t\t\t\t|");
        System.out.println("| PF -20%   :" +PF +               "\t\t\t\t|");
        System.out.println("|-------------------------------------------|");
        System.out.println("|Gross Salary :"+GS+               "\t\t\t\t|");
        System.out.println("|===========================================|");








    }
    public static float hra(float a) {
        return a * 0.10f;
    }
    public static float da(float a) {
        return a * 0.09f;
    }
    public static float ta(float a) {
        return a * 0.08f;
    }
    public static float pf(float a){
        return a * 0.20f;
    }
    //public static float grossSalary

}
