import java.util.Arrays;

/**
 * Created by michael_hopps on 10/20/17.
 */
public class ArraysMainOne {
    public static void main(String[] args) {

        int[] nums = new int[10];  //indexed 0 through 9
        //nums contains 10 0's.
        //modify nums to contain 0, 5, 10, 15...45
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i*5;
        }
        ArrayOperations thing = new ArrayOperations(nums);
        System.out.println( Arrays.toString(nums) );
        System.out.println(thing.countEvens());




//        System.out.println(nums);
////
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i] + " ");
//        }
////
//        for(int bob: nums){ //for each loop
//            System.out.print(bob + " ");
//        }
////        System.out.println();
//        System.out.println( Arrays.toString(nums) );

    }
}
