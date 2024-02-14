package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSumII {
    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> result = CombinationSumII.combinationSum2(candidates,target);
        System.out.println(result);
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new LinkedList<>();
        backtracking(candidates,target,result, new ArrayList<Integer>(),0);
        return result;
    }
    public static void  backtracking(int[] candidates, int target , List<List<Integer>> result , List<Integer> current , int start){
        if(target < 0) return;
        if(target == 0){
            result.add(new ArrayList<Integer>(current));
            return ;
        }

        for(int i = start ; i < candidates.length ; i++){
            if(i > start && candidates[i] == candidates[i-1]) continue;
            current.add(candidates[i]);
            backtracking(candidates, target - candidates[i],result,current,i+1);
            current.remove(current.size()-1);
        }
    }
}

