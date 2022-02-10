import java.util.Scanner;


/*
Program to input a string and print 'true' if it contains any integers and 'false' if it does not
 */

public class QuestionTwo {

    private boolean CheckForInt(String inputStr) {

        for(char ch:inputStr.toCharArray()){
            if(ch>=48 && ch<=57)
                return true;
        }
        return false;
    }

    public static void main(String[] args){
        QuestionTwo obj = new QuestionTwo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputStr = sc.nextLine();
        System.out.println(obj.CheckForInt(inputStr));
    }
}
