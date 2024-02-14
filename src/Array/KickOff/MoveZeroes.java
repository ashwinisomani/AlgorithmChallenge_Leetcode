package Array.KickOff;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
     int[] nums = {0,1,0,3,12};
     int[] result = MoveZeroes.moveZeroes(nums);
     System.out.println(Arrays.toString(result));
    }
    public static int[] moveZeroes(int[] nums) {
        int begin = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {

                int temp = nums[i];
                nums[i] = nums[begin];
                nums[begin] = temp;
                begin++;
            }
        }
        return nums;
    }
}

//Time Complexity = O(N)
//Space Complexity = O(1)


//BruteForce

//public void moveZeroes(int[] nums) {
//        int begin = 0 ;
//        for(int i = 0 ; i< nums.length ; i++){
//           if(nums[i] != 0){
//            nums[begin++] = nums[i];
//           }
//         }
//        for(int i = begin ; i< nums.length ;i++){
//           nums[begin++] = 0 ;
//          }
//        }
//    }
