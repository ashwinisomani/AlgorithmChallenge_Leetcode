package Array.KickOff;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
     int[] nums = { 100,4,200,1,3,2 };
     int result = LongestConsecutiveSequence.longestConsecutive(nums);
     System.out.println(result);

    }
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n: nums){
            set.add(n);
        }
        int longestSeq = 0;

        for(int i = 0 ;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int currNum = nums[i];
                int currSeq = 1;

                while(set.contains(currNum+1)){
                    currNum += 1;
                    currSeq += 1;
                }

                longestSeq = Math.max(longestSeq,currSeq);
            }
        }
        return longestSeq;
    }
}

//Time Complexity = O(N)
//Space Complexity = O(N)
