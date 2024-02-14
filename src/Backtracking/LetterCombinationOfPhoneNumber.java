package Backtracking;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LetterCombinationOfPhoneNumber {
    public static void main(String[] args) {
        String digits  = "23";
        List<String> result = LetterCombinationOfPhoneNumber.letterCombinations(digits);
        System.out.println(result);
    }
    public static List<String> letterCombinations(String digits) {
        Map<Character , char[]> map = new HashMap<>();
        map.put('2', new char[] {'a','b','c'});
        map.put('3' , new char[]{'d','e','f'});
        map.put('4' , new char[]{'g','h','i'});
        map.put('5' , new char[]{'j','k','l'});
        map.put('6' , new char[]{'m','n','o'});
        map.put('7' , new char[]{'p','q','r','s'});
        map.put('8' , new char[]{'t','u','v'});
        map.put('9' , new char[]{'w','x','y', 'z'});


        List<String> result = new LinkedList<>();
        if(digits.equals("")) return result;

        backtracking(digits,0, new StringBuilder(), result,map);
        return result;

    }

    public static void backtracking(String digits , int index , StringBuilder sb , List<String> result, Map<Character , char[]> map ){
        if(digits.length() == index){
            result.add(sb.toString());
            return;
        }

        char c = digits.charAt(index); //2
        char[] arr = map.get(c);     //abc

        for(int i = 0 ; i< arr.length; i++){
            sb.append(arr[i]);
            backtracking(digits,index+1,sb,result,map);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}


