package ArraysAndStrings;

/**
 * Created by nithyapari on 8/24/15.
 * Question: "Write a program that prints the numbers from 1 to 100.
 *            But for multiples of three print “Fizz” instead of the number and
 *            for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz”."
 */
public class FizzBuzz {

    public static void main(String[] args){

        for(int i = 1; i <= 100; i++){

            String output = "";

            output += ((i%3 ==0)? "Fizz": "");
            output += ((i%5 ==0)?"Buzz": "");

            if(!output.isEmpty()) System.out.println(output);
            else System.out.println(i);

        }
    }
}
