package Array.KickOff;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MissingRanges {
    public static void main(String[] args) {
     int[] nums = {0,1,3,50,75};
     int lower = 0;
     int upper = 99;

     List<List<Integer>> result = MissingRanges.findMissingRanges(nums,lower,upper);
     System.out.println(result);
    }
    public static List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        List<List<Integer>> result = new LinkedList<>();

        if(nums.length == 0){
            result.add(Arrays.asList(lower,upper));
            return result;
        }
        if(lower < nums[0]){
            result.add(Arrays.asList(lower, nums[0] -1));
        }

        for(int i = 0 ; i< nums.length-1;i++){
            if(nums[i+1] - nums[i] <= 1){
                continue;
            }
            result.add(Arrays.asList(nums[i]+1, nums[i+1]-1));
        }

        if(upper > nums[nums.length-1]){
            result.add(Arrays.asList(nums[nums.length -1 ]+1 , upper));
        }
        return result;
    }
}

//Time Complexity = O(N)
//Space Complexity = O(1)



