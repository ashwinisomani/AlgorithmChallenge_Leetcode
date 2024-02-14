package Array.KickOff;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
    int[] numbers = {2,7,11,15};
    int target = 9;

    int[] result = TwoSum.twoSum(numbers,target);
    System.out.println(Arrays.toString(result));
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i<nums.length;i++){
            int j = target - nums[i];

            if(map.containsKey(j)){
                return new int[] {map.get(j),i};
            }
            map.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }
}

//Time Complexity = O(N)
//Space Complexity = O(N)

