package Array.KickOff;

import java.util.HashMap;

public class MajorityElements {
    public static void main(String[] args) {
    int[] nums =  {3,2,3};
    int result = MajorityElements.majorityElement(nums);
    System.out.println(result);

    }
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int val : nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }


        for(int val : map.keySet()) {
            if(map.get(val) > n/2)
                return val;
        }
        return -1;
    }
}

//Time Complexity = O(N)
//Space Complexity = O(N)
