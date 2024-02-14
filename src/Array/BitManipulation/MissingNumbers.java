package Array.BitManipulation;

public class MissingNumbers {
    public static void main(String[] args) {

    }
    public int missingNumber(int[] nums) {
        int n = nums.length;
        for(int i = 0 ; i< nums.length ; i++){
            n ^= nums[i] ^ i;
        }
        return n;
    }
}

//Time Complexity = O(N)
//Space Complexity = O(1)


