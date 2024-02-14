package Array.TwoPointerInArray;

import java.util.Arrays;

public class SquareOfSortedArray {
    public static void main(String[] args) {
       int[] numbers = {-4,-1,0,3,10};
       int[] result = SquareOfSortedArray.sortedSquares(numbers);
       System.out.println(Arrays.toString(result));
    }
    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length -1;
        int index = nums.length -1;

        while(left <= right){
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if(leftSquare > rightSquare){
                result[index--] = leftSquare;
                left++;
            }
            else{
                result[index--] = rightSquare;
                right--;
            }
        }
        return result;
    }
}

//Time Complexity = O(N)
//Space Complexity = O(N)
