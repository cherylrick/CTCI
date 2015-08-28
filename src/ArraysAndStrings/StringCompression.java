package ArraysAndStrings;

import java.util.Scanner;


/**
 * Created by nithyapari on 8/26/15.
 */

/**
 * String Compression:
 * Implement a method to perform basic string compression using the counts of repeated characters.
 * If the compressed string would not become smaller than the original string, your method should
 * return the original string. You can assume the string has only uppercase and lowercase letters.
 */
public class StringCompression {


    public static void main(String[] args){

        StringCompression obj = new StringCompression();

        //Get String input from user
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter Input String: ");

        String output = obj.stringCompress(in.next());
        if(output != null)
        System.out.print(output);


    }

    String stringCompress(String input){

        //Test Cases
        //Check if String is empty or null
        if( input == null || input.length() == 0){
            System.out.println("Error: Invalid String Input");
            return null;
        }

        //Convert input string characters to lower case
        input = input.toLowerCase();

        int inputLength = input.length();
        int outputLength = 0;

        String output = new String();
        char prevChar;
        int prevCharCount = 0;

        //Storing the first character and its count
        prevChar = input.charAt(0);
        prevCharCount = 1;

        for(int i = 1; i < inputLength; i++){

            //Reading the current character
            char curChar = input.charAt(i);

            //Checking if the previous character is repeated
            if(curChar == prevChar)
                ++prevCharCount;
            else {

                //Character has changed, write character to output and increment outputLength
                output += prevChar;
                output += prevCharCount;

                //putting current character into prevChar
                prevChar = curChar;
                prevCharCount = 1;

            }
        }

        //Append the last character and its length
        output += prevChar;
        output += prevCharCount;

        //Finding output length
        outputLength = output.length();

        //Compare lengths of input and output strings
        if(inputLength >= outputLength)
            return output;
        else
            return input;
    }
}