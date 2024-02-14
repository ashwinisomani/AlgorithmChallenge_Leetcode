package Array.TwoPointerInArray;

import java.util.Arrays;

public class ProductOfArrayExceptItself {
    public static void main(String[] args) {
    int[] nums = {1,2,3,4};
    int[] result = ProductOfArrayExceptItself.productExceptSelf(nums);
    System.out.println(Arrays.toString(result));
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        output[0] = 1;
        for(int i = 1;i< nums.length ; i++){
            output[i] = output[i-1] * nums[i-1];
        }

        int R = 1;
        for(int i =  nums.length-1;i>=0;i--){
            output[i] = output[i] * R;
            R = nums[i] * R;
        }
        return output;
    }
}

//Time Complexity = O(N)
//Space Complexity = O(N)