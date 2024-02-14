package Array.KickOff;

import java.util.HashSet;
import java.util.Set;

public class ContainDuplicate {
    public static void main(String[] args) {
     int[] nums = {1,2,3,1};
     boolean result = ContainDuplicate.containsDuplicate(nums);
     System.out.println(result);
    }
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            if(set.contains(n)) return true;
            set.add(n);
        }
        return false;
    }
}

//Time Complexity = O(N)
//Space Complexity = O(N)
