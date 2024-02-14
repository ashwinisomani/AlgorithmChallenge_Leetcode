package Array.KickOff;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class MajorityElementsII {
    public static void main(String[] args) {
     int[] nums = {3,2,3};
     List<Integer> result = MajorityElementsII.majorityElement(nums);
     System.out.println(result);

    }
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new LinkedList<>();
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int val : nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }

        for(int val : map.keySet()) {
            if(map.get(val) > n/3)
                result.add(val);
        }
        return result;
    }
}


//Time Complexity = O(N)
//Space Complexity = O(N)
