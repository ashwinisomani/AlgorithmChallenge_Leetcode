package Array.TwoPointerInArray;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
     int[] nums = {-1,2,1,-4};
     int target = 1;
     int result =   ThreeSumClosest.threeSumClosest(nums,target);
        System.out.println(result);
    }
    public static int threeSumClosest(int[] nums, int target) {
        int answer  = Integer.MAX_VALUE;
        int minDiff = Integer.MAX_VALUE;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int low = i + 1;
            int high = nums.length - 1;

            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                int currentDiff = Math.abs(sum - target);

                if (currentDiff < minDiff) {
                    minDiff = currentDiff;
                    answer = sum;
                }

                if (sum < target) {
                    low++;
                } else {
                    high--;
                }
            }
        }

        return answer;
    }
}

//the overall time complexity is O(n log n) (sorting) + O(n^2) (nested loops) = O(n^2).
//Space Complexity: O(n)

