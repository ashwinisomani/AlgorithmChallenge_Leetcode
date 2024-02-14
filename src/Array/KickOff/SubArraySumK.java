package Array.KickOff;

import java.util.HashMap;

public class SubArraySumK {
    public static void main(String[] args) {
      int[] nums = {1,2,3};
      int k = 3;

      int result = SubArraySumK.subArraySum(nums,k);
      System.out.println(result);
    }
    public static int subArraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        for(int i = 0 ;i<nums.length;i++){
            sum+= nums[i];

            if(map.containsKey(sum-k)){
                count+= map.get(sum-k);
            }

            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}

//Time Complexity = O(N)
//Space Complexity = O(N)