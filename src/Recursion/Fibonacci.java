package Recursion;

/**
 * Created by nithyapari on 8/21/15.
 */

/**
 * Pseudocode:
 * Fiobacci Series - Each number is the sum of the previous two numbers
 *      F(0) = 0 and F(1) = 1
 *      F(2) = F(2-1) + F(2-2) = F(1) + F(0) = 1 + 0 = 1
 *      F(3) = F(3-1) + f(3-2) = F(2) + F(1) = 1 + 1 = 2
 *
 * Base Case:
 *      if number is 0 or 1, return 1
 * Recursive Case:
 *      if any other number, then return sum of previous two numbers
 */

import java.util.Scanner;

/**
 * Time Complexity:
 * Space Complexity:
 */
public class Fibonacci {

    int previous;

    public static void main(String[] args){

        Fibonacci obj = new Fibonacci();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number for Fibonacci Series: ");

        int length = Integer.parseInt(in.next());
        for(int i =0; i< length; i++)
            System.out.print(obj.fibonacci(i)+" ");
    }

    int fibonacci(int number){

        if(number == 0)
            return 0;
        else if(number == 1)
            return 1;
        else
            return fibonacci(number - 1) + fibonacci(number - 2);

    }
}
