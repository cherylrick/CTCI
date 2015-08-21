package ArraysAndStrings;

import java.util.*;
/**
 * Created by nithyapari on 7/13/15.
 * Q2) Check Permutation: Given two strings, write a method to decide if one is a permutation of the other.
 */
public class StringPermutation {

    public int isPermutation(String input1, String input2) {

        //Check if lengths are the same
        if(input1.length()!=input2.length())
            return -1;

        //sort the two lists and make them upper case
        char[] inp1 = input1.toCharArray();
        char[] inp2 = input2.toCharArray();

        Arrays.sort(inp1);

        Arrays.sort(inp2);
        String str1 = new String(inp1);
        String str2 = new String(inp2);

        if(str1.equalsIgnoreCase(str2))
            return 1;
        else
            return -1;
    }

    public static void main(String[] args)
    {
        String input1 = new String("gods");
        String input2 = new String("dog");
        StringPermutation obj = new StringPermutation();

        if(obj.isPermutation(input1, input2)==-1){
            System.out.println("RESULT: Not Permutation");
        }
        else {
            System.out.println("RESULT: Permutation");
        }
    }

}
