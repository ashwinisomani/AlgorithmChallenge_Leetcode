package Backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> result = Permutation.permute(nums);
        System.out.println(result);

    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        backtracking(nums,result, new ArrayList<>());
        return result;
    }

    public static void backtracking(int[] nums, List<List<Integer>> result , List<Integer> current){
        if(current.size() == nums.length){
            result.add(new ArrayList<Integer>(current));
            return;
        }


        for(int i = 0 ; i<nums.length ; i++){
            if(current.contains(nums[i])) continue;
            current.add(nums[i]);
            backtracking(nums,result,current);
            current.remove(current.size() -1);
        }
    }
}

