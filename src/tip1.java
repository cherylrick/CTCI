import java.util.*;
/**
 * Created by nithyapari on 7/20/15.
 */
public class tip1 {

    public int countPairsDiffTwo(){

        int[] numArray = {1, 3, 5, 7};
        int diff = 2;
        int pairCount = 0;

//Create a HashMap from Array
        HashMap<Integer, Boolean> numbers = new HashMap<Integer, Boolean>();
        for(int num : numArray){
            numbers.put(num, true);
        }

//Checking if num + diff or num - diff is present in the HashMap
        for(int num : numArray){
            if(numbers.containsKey(num + diff) || numbers.containsKey(num - diff)) {
                pairCount++;
            }
        }
        return pairCount;
    }

    public static void main(String[] args) {
        tip1 obj = new tip1();
        System.out.println("Number of Pairs of Diff 2: "+obj.countPairsDiffTwo());
    }
}
