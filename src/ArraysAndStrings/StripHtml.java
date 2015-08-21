package ArraysAndStrings;

/**
 * Created by nithyapari on 8/8/15.
 */
public class StripHtml {

    String stripHTML(String input){

        int readPtr = 0;
        int writePtr = 0;

        StringBuilder output = new StringBuilder();

        int newLength = 0;

        int length = input.length();
        while(readPtr < length){

            char currentChar = input.charAt(readPtr);
            //System.out.println(currentChar);

            if(currentChar == '<'){
                char skipChar = currentChar;
                while(skipChar != '>'){
                    readPtr++;
                    skipChar = input.charAt(readPtr);
                }

            }
            else{
                output.append(currentChar);
                writePtr++;
            }
            readPtr++;
        }
        System.out.println();

       return output.toString();
    }

    public static void main(String[] args){

        StripHtml obj = new StripHtml();
        String input ="<html><head><title>Hello World</title></head></html>";
        System.out.println("Original String: "+ input);
        System.out.println("String without HTML: " + obj.stripHTML(input));

    }

}

