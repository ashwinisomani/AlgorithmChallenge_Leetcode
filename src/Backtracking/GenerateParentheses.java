package Backtracking;

import java.util.LinkedList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
    int n = 3;
    List<String> result = GenerateParentheses.generateParenthesis(n);
    System.out.println(result);

    }
    public static List<String> generateParenthesis(int n) {
        List<String> result = new LinkedList<>();
        backtracking(n,0,0 ,"" , result );
        return result;
    }
    public static void backtracking(int n , int open , int close , String sb , List<String> result){
        if(sb.length() == 2*n){
            result.add(sb.toString());
            return;
        }

        if(open < n){
            backtracking(n , open+1 ,close ,sb+"(" ,result);
        }

        if(close < open){
            backtracking(n , open ,close+1 ,sb+")" ,result);
        }

    }
}

