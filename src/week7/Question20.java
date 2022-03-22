package week7;
/* user input = 11,22,33,44,55,66,77
Element =5
Output = Yes
 */


public class Question20 {
    public static void main(String[] args) {
        int[]userInput = {11,22,33,44,55,66,77};
        int specificElement = 44;
        Question20.getspecificValue(userInput,specificElement);
    }
    public static void getspecificValue(int[] userInput, int specificElement){
        int[] input = userInput;
        int element =specificElement;
        for (int i =0;i<input.length;i++){
                        if (input[i] ==element){
                System.out.println("Yes");
            }
        }

    }
}
