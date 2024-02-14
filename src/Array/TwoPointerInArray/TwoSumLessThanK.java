package Array.TwoPointerInArray;

import java.util.Arrays;

public class TwoSumLessThanK {
    public static void main(String[] args) {
       int[] nums = {34,23,1,24,75,33,54,8};
       int k = 60;

       int result = TwoSumLessThanK.twoSumLessThanK(nums,k);
        System.out.println(result);
    }
    public static int twoSumLessThanK(int[] nums, int k) {
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length -1;
        int answer = -1;

        while(low < high){
            int sum = nums[low]+nums[high];

            if(sum < k){
                answer = Math.max(answer,sum);
                low++;
            }
            else{
                high--;
            }
        }
        return answer;
    }
}

//Time Complexity: O(nlogn) to sort the array.
//Space Complexity: O(logn)