package Array.KickOff;

import java.util.HashSet;
import java.util.Set;

public class NumberOfArithmeticTriplet {
    public static void main(String[] args) {
      int[] nums = {0,1,4,6,7,10};
      int diff = 3;

      int result = NumberOfArithmeticTriplet.arithmeticTriplets(nums,diff);
      System.out.println(result);

    }
    public static int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            if(set.contains(n-diff) && set.contains(n-diff*2)) count++;
            set.add(n);
        }
        return count;
    }
}



