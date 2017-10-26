import java.util.Arrays;

/**
 * Created by michael_hopps on 10/25/17.
 */
public class WednesdayPractice {

    /*
    Returns the total number of characters contained in
    all of the strings in strs.
     */
    public int totalChars(String[] strs){
        int tots = 0;
//        for (int i = 0; i < strs.length; i++) {
//            tots += strs[i].length();
//        }
        for(String s: strs) {
            tots += s.length();
        }
        return tots;
    }

    /*
    Returns the arithmetic mean of the values in nums.
    Note that this returns a double, so it should include any decimals.
     */
    public double average(int[] nums){
        int totes = 0;
        for(int n: nums)
            totes += n;
        return (double)totes/nums.length;

    }

    /*
    Returns the index of the string with the fewest characters
    in strs.
     */
//    public int indexOfShortestString(String[] strs){
//
//    }


    /*
    This method replaces all instances of oldValue with newValue.
     */
//    public void replace(int[] arr, int oldValue, int newValue){
//
//    }

    //These print methods are provided for printing arrays.
    public void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
    public void printArray(String[] strs){
        System.out.println(Arrays.toString(strs));
    }

}
