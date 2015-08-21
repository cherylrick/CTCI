package ArraysAndStrings;

/**
 * Created by nithyapari on 8/7/15
 * Question: Given two Strings, find and print the longest
 * common Substring between them along with length
 */
public class LongestCommonSubstring {

    String findLCS(String one, String two){

        if(one == null || two == null || one.length() == 0 || two.length() ==0)
            return null;

        int length1 = one.length();
        int length2 = two.length();

        //Two Dimensional Array to hold the LCS Count
        int[][] LCSArray = new int[length1 + 1][length2 + 1];

        //Employ Dynamic Programming to create the LCS Matrix
        for(int i= 0; i< length1; i++){

            for(int j=0; j<length2; j++){

                if(one.charAt(i) == two.charAt(j)){
                    LCSArray[i+1][j+1] = LCSArray[i][j] + 1;
                }
                else {
                    LCSArray[i+1][j+1] = 0;
                }
            }
        }

        //Find Longest Length in LCS Matrix
        int LCSMaxLength = 0;
        int endIndex = -1;

        for(int i=0; i< length1+1; i++){
            for(int j=0; j< length2+1; j++){
              if(LCSArray[i][j] > LCSMaxLength)
                  LCSMaxLength = LCSArray[i][j];
                  endIndex = i - 1;
            }
        }
        System.out.println("Longest Common Substring Length: "+LCSMaxLength);

        //Printing the Longest Common Substring
        System.out.print("Longest Common Substring: ");
        for(int i=endIndex - LCSMaxLength; i<LCSMaxLength; i++)
            System.out.print(one.charAt(i));


        return null;
    }

    public static void main(String[] args){

        String first = "holmescrackm";
        String second = "holmescrac";

        LongestCommonSubstring LCS = new LongestCommonSubstring();
        LCS.findLCS(first,second);

    }
}
