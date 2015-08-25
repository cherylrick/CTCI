package ArraysAndStrings;
import java.util.Set;
import java.util.HashSet;

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

        // Why HashSet?
        // This Collection class allows storage of only unique characters
        Set<Character> set = new HashSet<Character>();

        /**
         * Add first string characters to Set
         */
        for(int i=0; i<s1Length; i++){
            set.add(s1.charAt(i));
        }

        /**
         * Adding second string characters to Set
         * If it allows the addition, then second string has new characters
         * Thus, they cannot be anagrams
         */
        for(int j=0; j<s2Length; j++){
            if(set.add(s2.charAt(j)))
                return false;
        }

        //All constraints crossed, so the strings are indeed anagrams of each other
        return true;

    }
}
