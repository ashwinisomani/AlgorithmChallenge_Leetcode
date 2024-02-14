package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
      int[] nums = {1,2,3};
      List<List<Integer>> result = Subset.subsets(nums);
      System.out.println(result);

    }
    public static List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        backtracking(nums, result , new ArrayList<>() , 0);
        return result;
    }

    public static void backtracking(int[] nums, List<List<Integer>> result , List<Integer> current , int start){
        result.add(new ArrayList<Integer>(current));

        for(int i = start ; i< nums.length ;i++){
            if(i > start && nums[i] == nums[i-1]) continue;
            current.add(nums[i]);
            backtracking(nums,result,current,i+1);
            current.remove(current.size()-1);
        }
    }
}

// 3 numbers
// combination of 3 binary number [0,1]

// 000 = []
// 001 = [3]
// 010 = [2]
// 011 = [2,3]
// 100 = [1]
// 101 = [1,3]
// 110 = [1,2]
// 111 = [1,2,3]


