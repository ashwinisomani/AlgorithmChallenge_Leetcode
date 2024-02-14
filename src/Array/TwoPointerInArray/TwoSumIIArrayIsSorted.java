package Array.TwoPointerInArray;

import java.util.Arrays;

public class TwoSumIIArrayIsSorted {
    public static void main(String[] args) {
      int[] numbers = {2,7,11,15};
      int target = 9;

      int[] result = TwoSumIIArrayIsSorted.twoSum(numbers,target);
        System.out.println(Arrays.toString(result));

    }
    public static int[] twoSum(int[] numbers, int target) {
        int low = 0 ;
        int high = numbers.length - 1;

        while(low <high){
            if(numbers[low] + numbers[high] == target){
                return new int[] {low+1, high+1};
            }
            else if(numbers[low] + numbers[high] < target){
                low++;
            }
            else{
                high--;
            }
        }
        return new int[] {-1,-1};
    }
}

//Time Complexity = O(N)
//Space Complexity = O(1)