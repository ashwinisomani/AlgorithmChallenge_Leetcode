package Array.BitManipulation;

public class SingleNumber {
    public static void main(String[] args) {
    int[] nums = {2,2,1};
    int result = SingleNumber.singleNumber(nums);
        System.out.println(result);
    }
    public static int singleNumber(int[] nums) {
        int sum = 0;
        for(int i = 0 ; i< nums.length;i++){
            sum = sum ^ nums[i];
        }
        return sum;
    }
}

//Time Complexity = O(N)
//Space Complexity = O(1)


