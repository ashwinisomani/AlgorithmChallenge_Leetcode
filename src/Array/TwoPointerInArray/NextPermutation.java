package Array.TwoPointerInArray;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
     int[] nums = {1,3,5,4,2};
     int[] result = NextPermutation.nextPermutation(nums);
        System.out.println(Arrays.toString(result));

    }
    public static int[] nextPermutation(int[] nums) {
        int i = nums.length-2;
        while(i >= 0 && nums[i+1] <= nums[i]){
            i--;
        }
        if(i>=0){
            int j = nums.length-1;
            while(j >= 0 && nums[j] <= nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums ,i+1);
        return nums;
    }

    public static void reverse(int[] nums ,int start){
        int i = start;
        int j = nums.length -1 ;
        while(i < j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }

    public static  void swap(int[] nums , int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
}

