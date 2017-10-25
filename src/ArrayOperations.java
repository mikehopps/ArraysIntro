import java.util.Arrays;

/**
 * Created by michael_hopps on 10/20/17.
 */
public class ArrayOperations {

    private int[] arr;

    public ArrayOperations(int[] arr){
        this.arr = arr;
    }

    //returns the sum of the elements of arr
    public int getSum(){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    /*
    returns the number of even values
    in the array arr.
     */
    public int countEvens(){
        int count = 0;
        for(int n: arr){
            if(n % 2 == 0)
                count++;
        }

//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] % 2 == 0) {
//                count++;
//            }
//        }
        return count;
    }

    public int getMaxValue(){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        return max;

    }


}
