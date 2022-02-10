import java.util.Scanner;

/*
Program to input a string and convert it into an integer without using built-in methods
 */
public class QuestionOne {

    /*
    Method to build the integer by parsing through the string elements. If any character other than an integer is
    encountered, an exception is thrown.
     */
    public int stringToInt(String inputStr, int pos) throws Exception{
        int resultInt = 0;

        if(inputStr.length()==pos)
            throw new Exception("Empty input");

        while(pos<inputStr.length()){
            char ch = inputStr.charAt(pos++);
                if (ch >= 48 && ch <= 57) {
                    resultInt = resultInt * 10 + (ch - '0');
                }
            else{
                throw new Exception("Not a number");
            }
        }
        return resultInt;
    }

    /*
    Method to perform preliminary checks on the input and later print the result
     */
    private void computeAndPrint(String inputStr) {

        boolean neg = false;
        int convertedInt=0;
        boolean isNotInt=false;
        int pos = 0;

        //checking if string is empty
        if(pos==inputStr.length()){
            isNotInt=true;
        }
        else {
            //To handle negative integers
            if (inputStr.charAt(0) == '-') {
                neg = true;
                pos = 1;
            }

            //try to convert string to int
            try {
                convertedInt = stringToInt(inputStr, pos);
                if (neg)
                    convertedInt = -convertedInt;
            } catch (Exception e) {
                isNotInt = true;
            }
        }
        if(isNotInt)
            System.out.println("Invalid input");
        else
            System.out.println("The converted integer: " + convertedInt);
    }

    public static void main(String[] args){
        QuestionOne obj = new QuestionOne();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputStr = sc.nextLine();
        obj.computeAndPrint(inputStr);
    }

}