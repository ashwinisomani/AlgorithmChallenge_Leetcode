package Backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {
       int n = 4;
       int k = 2;

        List<List<Integer>> result = Combinations.combine(n,k);
        System.out.println(result);
    }
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new LinkedList<>();
        backtracking(n,k,result, new ArrayList<Integer>() , 1);
        return result;

    }

    public static void backtracking(int n, int k , List<List<Integer>> result , List<Integer> current, int start){
        if(current.size() == k){
            result.add(new ArrayList<Integer>(current));
            return;
        }

        for(int i = start ; i<=n ;i++){
            current.add(i);
            backtracking(n , k , result, current , i+1);
            current.remove(current.size()-1);
        }
    }
}

