package Backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
       int[] candidates = {2,3,6,7};
       int target = 7;
        List<List<Integer>> result = CombinationSum.combinationSum(candidates,target);
        System.out.println(result);

    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new LinkedList<>();
        backtracking(candidates,target,result, new ArrayList<Integer>(),0);
        return result;
    }
    public static void backtracking(int[] candidates, int target , List<List<Integer>> result , List<Integer> current , int size){
        if(target < 0) return;
        if(target == 0){
            result.add(new ArrayList<Integer>(current));
            return ;
        }

        for(int i = size ; i < candidates.length ; i++){
            current.add(candidates[i]);
            backtracking(candidates, target - candidates[i],result,current,i);
            current.remove(current.size()-1);
        }
    }
}

