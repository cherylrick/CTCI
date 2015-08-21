package ArraysAndStrings;

/**
 * Created by nithyapari on 8/3/15.
 * Question: Given an Array and its rotation degree, rotate the array in a single pass
 */
public class Rotate {

    static int[] input={1,2,3,4,5,6,7};

    public static void main(String[] args){
        Rotate obj = new Rotate();
        obj.rotateArray(input, 2);
    }

    //Function to rotate the array by a given degree
    void rotateArray(int[] input, int degree){

        //Check for valid input
        if(input == null || degree < 0)
            return;

        //Finding length of input array
        int length = input.length;

        //Finding the smallest rotation degree that
        // is actually needed
        if(degree > length)
          degree = degree % length;

        //Split array into first part and second part
        // based on degree value
        int firstStart = 0;
        int firstEnd = length - degree - 1;

        int secondStart = length - degree;
        int secondEnd = length - 1;

        //Printing the original Array
        printArray(input);

        //Reverse the first part
        reverse(input, firstStart, firstEnd );
        printArray(input);

        //Reverse the second part
        reverse(input, secondStart, secondEnd);
        printArray(input);

        //Reverse the entire array
        reverse(input, firstStart, secondEnd);
        printArray(input);

    }

    //Function to reverse an array given the array, first and last index of the array
    void reverse(int[] input, int firstIndex, int lastIndex){

        int temp;

        if(input ==null || firstIndex <0 || lastIndex <0)
            return;

        //Swap the first and last elements and move forward till they collide
        while(firstIndex < lastIndex){
            temp = input[firstIndex];
            input[firstIndex] = input[lastIndex];
            input[lastIndex] = temp;

            firstIndex++;
            lastIndex--;
        }
    }

    //Function to print the array
    void printArray(int[] input){
        int length = input.length;

        for(int i=0; i<length; i++){
            System.out.print(input[i]+" ");
        }
        System.out.println();
    }
}