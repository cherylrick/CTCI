package Recursion;

import java.util.Arrays;

/**
 * Created by nithyapari on 8/16/15.
 */
public class Recursion {

    public static void main(String[] args){

        //Factorial of a Number
        Factorial fact = new Factorial();
        System.out.println("Factorial of 3: " +fact.factorial(3));

        //Binary Search
        BinarySearch search = new BinarySearch();
        //int[] inputArray = {10, 20, 30, 15, 29, 5, 35};
        int[] inputArray = {10, 20, 30, 35, 49, 55, 65};
        //                   0   1   2   3   4   5   6
        search.searchElement(inputArray);

    }


}
