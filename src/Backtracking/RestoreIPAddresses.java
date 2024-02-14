package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddresses {
    public static void main(String[] args) {
       String s = "25525511135";
       List<String> result = RestoreIPAddresses.restoreIpAddresses(s);
       System.out.println(result);
    }
    public static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s,result, new ArrayList<>(),0 );
        return result;
    }

    private static void backtrack(String s, List<String> result ,  List<String> current , int start) {
        if (current.size() == 4) {
            if (start == s.length()) {
                result.add(String.join(".", current));
            }
            return;
        }
        for (int i = start; i < s.length() && i < start + 3 ; i++) {
            String sub = s.substring(start, i + 1);
            if (isValid(sub)) {
                current.add(sub);
                backtrack(s, result, current, i + 1);
                current.remove(current.size() - 1);
            }
        }
    }

    private static boolean isValid(String s) {
        if (s.length() > 1 && s.charAt(0) == '0') {
            return false;                 //check leading zeroes
        }
        int num = Integer.parseInt(s);
        return num >= 0 && num <= 255;   //check length
    }
}

