package Backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PalindromePartitioning {
    public static void main(String[] args) {
        String s = "aab";
        List<List<String>> result = PalindromePartitioning.partition(s);
        System.out.println(result);

    }
    public static List<List<String>> partition(String s) {
        List<List<String>> result = new LinkedList<>();
        backtracking(s, result , new ArrayList<>() , 0);
        return result;
    }

    public static void backtracking(String s , List<List<String>> result, List<String> current, int start ){
        if(start >= s.length()){
            result.add(new ArrayList<String>(current));
            return;
        }

        for(int i = start ; i< s.length() ;i++){
            if(isPalindrome(s,start,i)){
                if(start == i)
                    current.add(Character.toString(s.charAt(i)));
                else
                    current.add(s.substring(start , i+1));
                backtracking(s,result,current,i+1);
                current.remove(current.size() -1);

            }
        }
    }

    public static boolean isPalindrome(String s , int a_pointer , int b_pointer){
        while(a_pointer < b_pointer){
            if(s.charAt(a_pointer) != s.charAt(b_pointer)){
                return false;
            }
            a_pointer++;
            b_pointer--;
        }
        return true;
    }
}

