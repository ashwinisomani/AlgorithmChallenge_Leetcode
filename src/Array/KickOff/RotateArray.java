package Array.KickOff;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
     int[] nums = {1,2,3,4,5,6,7};
     int k = 3;

     int[] result = RotateArray.rotate(nums,k);
     System.out.println(Arrays.toString(result));

    }
    public static int[] rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums, k ,nums.length-1);
      return nums;
    }

    public static void reverse(int[] nums , int start , int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

    }
}
//Time Complexity = O(N)
//Space Complexity = O(1)


// rotate k time
// 1 2 3 4 5 6 7
// 5 6 7 1 2 3 4

// k =  k % nums.length 7 % 3 = 4
// reverse(nums,0,nums.length) 7 6 5 4 3 2 1
// revrese(nums,0 ,k-1) 5 6 7 4 3 2 1
// reverse(nums,k,nums.length) 5 6 7 1 2 3 4