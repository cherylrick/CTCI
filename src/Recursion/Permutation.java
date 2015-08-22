package Recursion;


/**
 * Created by nithyapari on 8/17/15.
 */
public class Permutation {

    static String input = "abc";
    static int length = input.length();

    static StringBuilder output = new StringBuilder();
    static boolean[] usedLetter = new boolean[length];

    static int j = 0;

    public static void main(String[] args) {

        Permutation obj = new Permutation();
        obj.permute();

    }

    //Recursive Function
    void permute() {

        if (output.length() == length) {
            System.out.println(output.toString());
            return;
        }

        for (int i = 0; i < length; i++) {

            //Check if Start Letter has been used already, then skip
            if (usedLetter[i])
                continue;
            else {
                //Set it as Start Letter
                usedLetter[i] = true;

                //Append to String Builder
                output.append(input.charAt(i));

                //Recursion Call - This will complete all permutations with Start Letter that was chosen
                permute();

                //After printing the permutation, return back and set the last character as not used now
                usedLetter[i] = false;

                int newLength = output.length() - 1;
                output.setLength(newLength);

            }

        }


    }

}
