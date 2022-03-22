package week7;
//week 7 homework in g drive sharded folder
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        //using scanner to allow user to input marks for all 3 subjects plus name and roll number
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the student :");
        String name = scan.nextLine();
        System.out.println("Enter the roll number of the student :");
        int roll_number = scan.nextInt();
        System.out.println("Enter Math mark : ");
        int mathmark = scan.nextInt();
        System.out.println("Enter Science mark :");
        int sciencemark = scan.nextInt();
        System.out.println("Enter English mark :");
        int englishmark = scan.nextInt();
     //   System.out.println("mathmark + englishmark + sciencemark");
       // int total = scan.nextInt();
       // System.out.println("");
       // int percentage = scan.nextInt();

        if (mathmark < 0 || mathmark > 100) {
            System.out.println("Invalid Input of Math mark should between 0 to 100");
        } else if (sciencemark < 0 || sciencemark > 100) {
            System.out.println("Invalid Input of science mark should between 0 to 100");
        } else if (englishmark < 0 || englishmark > 100) {
            System.out.println("Invalid Input of english mark should between 0 to 100");
        } else {
            int t= mathmark + sciencemark + englishmark;//define integer for total
            int percentage = ((t)*100)/300;
          //  int percentage = (total * 100) / 300;//define percentage
           // Question3.grade1(percentage);
           // Question3.result1(percentage);


        }

        System.out.println("|---------------------------|");
        System.out.println("|     Mark Sheet            |");
        System.out.println("|---------------------------|");
        System.out.println("| Name " + name + " |");
        System.out.println("Roll number:" + roll_number + "|");
        System.out.println("|---------------------------|");
        System.out.println("| Subjects     /     Marks |");
        System.out.println("|---------------------------|");
        System.out.println("| Math    :" + mathmark + "|");
        System.out.println("| Science :" + sciencemark + "|");
        System.out.println("| English :" + englishmark + "|");
        System.out.println("|----------------------------|");
        System.out.println("| Total : " + "total" + "|");
        System.out.println("|----------------------------|");
        System.out.println("| Percentage :" + "percentage" + "|");
       // System.out.println("| Result:"+passFail(int percentage ;)"|");
       // System.out.println("| Grade : "+gradecheck(passFail()) + "|");
        System.out.println("| Total : " + "total" + "|");
        System.out.println("|----------------------------|");
    }
//define one static method for grade
      public static String gradecheck (int a){
        String grade ;
        if (a >= 80) {
            grade = "A+";
        }else if (a >= 60 && a <= 80){
            grade = "A";
       } else if (a >= 50 && a <= 60) {
             grade = "B";
       } else if (a >= 35 && a <= 50) {
             grade = "C";
        } else {
            grade = "Fail";
        }
        return grade;//return data type grade
    }
    //define method for pass and fail

    public static String passFail(int a) {
        String result;
        if (a >= 35) {
            result = "Pass";
        } else {
            result = "Fail";
        }

        return result;
    }
}















