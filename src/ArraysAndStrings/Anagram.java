package ArraysAndStrings;
import java.util.HashMap;
//import java.util.Set;
//import java.util.HashSet;

/**
 * Created by nithyapari on 8/25/15.
 */
public class Anagram {
    public static void main(String[] args){

        String s1 = "Silent";
        String s2 = "Listen";

        Anagram check = new Anagram();
        if(check.isAnagram(s1, s2))
            System.out.println(s1+" and "+s2+" are Anagrams");
        else
            System.out.println(s1+" and "+s2+" are NOT Anagrams");
    }

    /**
     *  Test Cases
     *  1. Strings are not null?
     *  2. Strings are of same length?
     *  3. String lengths are greater than 0?
     *
     *  Pseudo code
     *  Add first String Characters to HashSet
     *  Try adding second String Characters
     */
    boolean isAnagram(String s1, String s2){

        //Test Cases
        if(s1 == null || s2 == null)
            return false;

        int s1Length = s1.length();
        int s2Length = s2.length();

        if(s1Length <0 || s2Length <0 || s1Length != s2Length)
            return false;

        /**Converting all characters to lowercase
         * Why? Because 'l' and 'L' are considered as two different characters
         */
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();


        /** Why HashSet?
         * This Collection class allows storage of only unique characters
         * Why not HashSet? Will not work for input strings having repeated characters:
         * Example: Strings 'madam' and 'damam'.
         * It will fail in the first for loop itself because the for loop will
         * try to add 'a' twice
         * Count of the characters should be maintained to address this issue
         * HashMap can be used
         */

            /*COMMENTING OLD SOLUTION*/

                    //Set<Character> set = new HashSet<Character>();

                    /**
                     * Add first string characters to Set
                     */
                        //  for(int i=0; i<s1Length; i++){
                        //      set.add(s1.charAt(i));
                        //  }

                    /**
                     * Adding second string characters to Set
                     * If it allows the addition, then second string has new characters
                     * Thus, they cannot be anagrams
                     */
                        //   for(int j=0; j<s2Length; j++){
                        //       if(set.add(s2.charAt(j)))
                        //           return false;
                        //   }

        /**
         *  Using HashMap to maintain count of each character in the first String
         *  For every character in String 1,
         *      increment count by 1 if already present
         *      add to map with count as 1, if not already present
         *  For every character in String 2, decrement count by 1
         */
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        /**
         * Add first string characters to Hash Map and store its count
         */
          for(int i=0; i<s1Length; i++){
              Character key = s1.charAt(i);
              Integer value = map.get(key);

              //Checking if Character is already present
              if(value == null)
                  map.put(key,1);
              else
                  map.put(key,value++);
          }

        /**
         * Decrement count in Hash Map for every Character in second String
         */
        for(int i=0; i<s2Length; i++){
            Character key = s2.charAt(i);
            Integer value = map.get(key);

            //Checking if Character is already present
            if(value == null)
                return false; //Character in Second string missing in first string, cannot be anagram
            else
                map.put(key,--value);
        }

        //Check if any of the count values in the Hash Map is not 0
        for(int value : map.values())
            if(value !=0 )
                return false;

        //All constraints crossed, so the strings are indeed anagrams of each other
        return true;

    }
}
