package Array.TwoPointerInArray;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
     int[] nums = {-1,0,1,2,-1,-4};
     List<List<Integer>> result = ThreeSum.threeSum(nums);
     System.out.println(result);

    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        Arrays.sort(nums);
        for(int i = 0 ; i< nums.length - 2 ;i++){
            if(i == 0 || (i > 0 && nums[i] != nums[i-1])){
                int low = i+1;
                int high = nums.length-1;
                int sum = 0 - nums[i];

                while(low< high){
                    if(nums[low] + nums[high] == sum){
                        result.add(Arrays.asList(nums[low],nums[high], nums[i]));

                        while(low< high && nums[low] == nums[low+1])low++;
                        while(low< high && nums[high] == nums[high-1])high--;
                        low++;
                        high--;
                    }
                    else if (nums[low] + nums[high] < sum){
                        low++;
                    }
                    else{
                        high--;
                    }
                }
            }
        }
        return result;
    }
}

//the overall time complexity is O(n log n) (sorting) + O(n^2) (nested loops) = O(n^2).
//Space Complexity: O(n)

