package Recursion;

/**
 * Created by nithyapari on 8/16/15.
 */
public class Factorial {


    /*
    * FACTORIAL OF A NUMBER
    *  ---------------------
    *  n! = n(n-1)!
    *  0! = 1
    *  1! = 1
    *
    */

    /* Pseudocode:
     *   Check if input number n is 1 or 0 and if yes, return 1 // 0! = 1! = 1
     *  Else recursively call the same function with value (n-1) and multiply the return value by n

     * Time Complexity:
       O(n)

     * Space Complexity:
       O(1)
    */

    int factorial(int inputNumber){

        //Base Case
        if( inputNumber <= 1){
            return 1;
        }

        //Recursion Case
        return inputNumber * factorial(inputNumber - 1);
    }
}
