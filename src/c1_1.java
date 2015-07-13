import java.util.HashMap;
import java.io.*;

/**
 * Created by nithyapari on 7/12/15.
 * Writing a method to find if a string is unique
 */
public class c1_1 {


    public int isUnique(String input) {

        //Creating Hashmap
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        //Check if char present, if so -1 else +1
        int length = input.length();

        for (int i = 0; i < length; i++) {

            char curChar = input.charAt(i);
            int curCharVal = 0;
            System.out.println("Current Char:" + curChar + ", Current Char Val:" + curCharVal);

            if (map.containsKey(curChar)) {
                System.out.println("Character found in Hash Table, -1");
                curCharVal = map.get(curChar);
                map.put(curChar, curCharVal - 1);
                return -1;
            }
            else {
                System.out.println("Character not found in Hash Table, adding it with 1");
                map.put(curChar,curCharVal + 1);
            }
        }

        return 1;
    }

    public static void main(String[] args)
    {
        String input = new String("Helo");
        c1_1 obj = new c1_1();

        if(obj.isUnique(input)==-1){
         System.out.println("RESULT: String not Unique");
        }
        else {
            System.out.println("RESULT: String is Unique");
        }
    }








}
