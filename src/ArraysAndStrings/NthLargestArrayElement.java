package ArraysAndStrings;
import java.util.Arrays;

/**
 * Created by nithyapari on 8/25/15.
 */
public class NthLargestArrayElement {

    public static void main(String[] args){

        int[] inputArray = {5,2,4,7,1,6}  ;

        NthLargestArrayElement find = new NthLargestArrayElement();
        find.getNthLargestElement(2,inputArray);

    }

    /* Get the nth Largest number from an Integer Array
     */
    int getNthLargestElement(int n, int[] inputArray){

        //Sort the input Array in ascending order - Uses Quick Sort
        Arrays.sort(inputArray);

        //Length of input array
        int length = inputArray.length;

        //Printing the nth largest element
        System.out.print(n+"th largest element: "+inputArray[length-n]);


        return -1;
    }
}
