package Backtracking;

import java.util.*;

public class WordBreakII {
    public static void main(String[] args) {
     String s = "catsanddog";
     List<String> wordDict = Arrays.asList("cat","cats","and","sand","dog");

     List<String> result = WordBreakII.wordBreak(s,wordDict);
     System.out.println(result);
    }

   public static List<String> wordBreak(String s, List<String> wordDict) {
            List<String> result = new ArrayList<>();
            backtracking(s, new HashSet<>(wordDict), result, new StringBuilder() , 0);
            return result;
        }

   private static void backtracking(String s, Set<String> wordDict, List<String> result, StringBuilder answer , int index){

            if(index == s.length()){
                result.add(answer.toString().trim());
                return;
            }

            StringBuilder sb = new StringBuilder();
            for(int i=index ; i<s.length(); i++){
                sb.append(s.charAt(i));

                //Backtracking and Recursion
                if(wordDict.contains(sb.toString())){
                    answer.append(sb + " "); // --->Forward...
                    backtracking(s, wordDict, result, answer,i+1); // --->Recursion....
                    answer.delete(answer.length()-sb.length()-1, answer.length()); // --->Backward..
                }
            }
        }
    }

