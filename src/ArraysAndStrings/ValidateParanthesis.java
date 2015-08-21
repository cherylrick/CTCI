package ArraysAndStrings;
import java.util.Stack;

/**
 * Created by nithyapari on 8/19/15.
 */
public class ValidateParanthesis {


    public static void main(String[] args){

        String input = "({[ hello world ]})";
        String input2 = "([()])";

        ValidateParanthesis obj = new ValidateParanthesis();
        obj.validate(input2);
    }

    int validate(String input){

        Stack<Character> stack = new Stack<Character>();

        int length = input.length();

        int flag = 1;

        for(int i=0; i < length; i++){

            char currentChar = input.charAt(i);
            if( currentChar =='(' || currentChar =='{' || currentChar =='['){
                //System.out.println(currentChar);
                stack.push(currentChar);
            }

            if( currentChar ==')' ){
                char stackChar = stack.pop();

                if(stackChar != '('){
                    flag = -1;
                    break;
                }
            }
            if( currentChar =='}'){
                char stackChar = stack.pop();

                if(stackChar != '{'){
                    flag = -1;
                    break;
                }
            }
            if( currentChar ==']'){
                char stackChar = stack.pop();


                if(stackChar != '['){

                    flag = -1;
                    break;
                }
            }
        }


        if(flag != -1 && stack.size() == 0)
            System.out.println("String is valid!");
        else
            System.out.println("Error: String has compiler errors!");


        return -1;
    }
}
