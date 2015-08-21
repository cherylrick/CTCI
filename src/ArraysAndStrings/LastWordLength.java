package ArraysAndStrings;

/**
 * Created by nithyapari on 8/19/15.
 */
public class LastWordLength {

    /* Problem 1: Length of Last Word
        Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
        If the last word does not exist, return 0.
        Example:
            Input: "Welcome to the Interview Prep and Algorithm Study Group"
            Output: 5
    */

    public static void main(String[] args){

        LastWordLength obj = new LastWordLength();
        String input1 = "Welcome to the Interview Prep and Algorithm Study Group";
        String input2 = " ";
        String input3 = "hey";

        String input = input3;

        int lastIndex = obj.wordLength(input);

        if(lastIndex != -1){
            String lastWord = input.substring( lastIndex + 1);
            System.out.println("Last word: "+lastWord+" length: "+lastWord.length());
        }

    }

    int wordLength(String input){

        if(input.length() ==0 || input == null){
            System.out.println("Error: Null String");
            return -1;
        }
        else{

            System.out.println(input.indexOf(' '));

            int lastIndex = input.lastIndexOf(' ');

            //Checking if Input has just one word
            if(lastIndex == -1){
                return 0;
            }

            if(input.substring(lastIndex).equals(" ")) {
                System.out.println("Error: Empty String!");
                return -1;
            }
            else
                return lastIndex;
        }

    }
}
