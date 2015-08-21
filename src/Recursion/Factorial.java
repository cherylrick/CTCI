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

    /*
    *  Test Cases - Throw error messages
    *  --------------------------------
    *  If number is empty
    *  If number is negative
    *
    *
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
