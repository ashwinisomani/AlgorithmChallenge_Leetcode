package Array.SortingArray;

public class FindTheDuplicateNumber {
    public static void main(String[] args) {
     int[]  nums = {1,3,4,2,2};
     int result = FindTheDuplicateNumber.findDuplicate(nums);
     System.out.println(result);
    }
    public static int findDuplicate(int[] nums) {
        while (nums[0] != nums[nums[0]]) {
            int nxt = nums[nums[0]];
            nums[nums[0]] = nums[0];
            nums[0] = nxt;
        }
        return nums[0];
    }
}

//Using Cyclic sort
//Time Complexity = O(N)
//Space Complexity = O(1)
