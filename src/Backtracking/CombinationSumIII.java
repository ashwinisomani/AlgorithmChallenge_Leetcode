package Backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombinationSumIII {
    public static void main(String[] args) {
        int k = 3;
        int n = 7;

        List<List<Integer>> result =  CombinationSumIII.combinationSum3(k,n);
        System.out.println(result);
    }
    public static List<List<Integer>> combinationSum3(int k, int n) {
    int[] nums = {1,2,3,4,5,6,7,8,9};
    List<List<Integer>> result = new LinkedList<>();
    backtracking(nums, k,n,result, new ArrayList<Integer>(),0);
        return result;
}
    public static void  backtracking(int[] nums , int k , int n , List<List<Integer>> result , List<Integer> current , int start){
        if(n == 0 && k ==0){
            result.add(new ArrayList<Integer>(current));
            return ;
        }

        for(int i = start ; i < nums.length ; i++){
            current.add(nums[i]);
            backtracking(nums, k-1, n-nums[i],result,current,i+1);
            current.remove(current.size()-1);
        }
    }
}