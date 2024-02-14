package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PermutationII {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        List<List<Integer>> result = PermutationII.permuteUnique(nums);
        System.out.println(result);
    }
    public static List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtracking(nums, used, result, new ArrayList<>());
        return result;
    }
    public static void backtracking(int[] nums, boolean[] used, List<List<Integer>> result, List<Integer> current) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) {
                continue;
            }
            used[i] = true;
            current.add(nums[i]);
            backtracking(nums, used, result, current);
            used[i] = false;
            current.remove(current.size() - 1);
        }
    }
}
