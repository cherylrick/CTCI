package Recursion;
import java.util.Scanner;
import java.lang.Exception;

/**
 * Created by nithyapari on 8/16/15.
 */
public class BinarySearch {

    /*
    *  BINARY SEARCH
    *  ---------------------
    *  Input is a Sorted Array
    *  Find Middle = [start + (start + end) / 2]
    *  Check Middle
    *  If not equal, check if < Middle
    *  If yes, set end as Middle - 1
    *  Repeat Binary Search
    *  If no, set start as Middle + 1
    */

    /*
    *  Test Cases - Throw error messages
    *  --------------------------------
    *  If range (end - start) < 0, Limits Reversed and stop recursion
    *  If range == 0 and inputArray[start] != element OR inputArray[end] != element, element not found and stop recursion
    *  If inputArray[start] > inputArray[End] then inputArray is not sorted, stop recursion
    *
    */

    //Wrapper Function
    void searchElement(int[] inputArray){

        //Test Cases

        //Check if Input Array is empty or Null
        if(inputArray == null || inputArray.length == 0){
            System.out.println("Input Array is Empty");
            return;
        }

        //Calculate Start and End Index
        int start = 0;
        int end = inputArray.length - 1;

        //Get input element from user
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to search: ");
        int element = Integer.parseInt(in.next());

        try{
            int elementPosition = binarySearch(inputArray, element, start, end);
            System.out.println("Search Element found at position: " + elementPosition);
        }

        catch(Exception e){

            System.out.println(e);
        }


    }

    //Recursive Function
    int binarySearch(int[] inputArray, int element, int start, int end) throws Exception{

        System.out.println("Start: "+start+" End: "+end);

        //Calculate Range value for test cases
        int range = end - start;

        //Check if start index has exceeded end index
        if(range < 0 ) {
            throw new Exception("Search Element not in Input Array");
        }

        //Check if start and end index are same and if it is the search element
        if(range == 0 && inputArray[start] != element)
            throw new Exception("Search Element not in Input Array");

        //Check if input array is sorted
        if(inputArray[end] < inputArray[start]) {
            throw new Exception("Input Array is not sorted. Cannot perform Binary Search");
        }

        int middle = start + (range / 2);
        int middleElement = inputArray[middle];
        System.out.println("Start: "+start+" End: "+end+" Middle: "+middle+" Middle Element: "+middleElement);

        //Check if middle element matches
        if(element == middleElement)
            return middle;
        else if(element < middleElement)
            return binarySearch(inputArray, element, start, middle - 1);
        else
            return binarySearch(inputArray, element, middle + 1, end);
    }


}
