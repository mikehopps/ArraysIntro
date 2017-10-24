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

        return 0;
    }


}
