package Array.KickOff;

public class MaximumDifferenceBetweenIncreasingElements {
    public static void main(String[] args) {
       int[] nums = {7,1,5,4};
       int result = MaximumDifferenceBetweenIncreasingElements.maximumDifference(nums);
       System.out.println(result);
    }
    public static int maximumDifference(int[] nums) {
        int min = nums[0];
        int max = -1;

        for(int i = 0 ;i< nums.length ;i++){
            int diff = nums[i] - min;

            if(diff>0){
                max = Math.max(diff, max);
            }

            if(nums[i] < min){
                min = nums[i];
            }
        }
        return max;
    }
}

//Time Complexity = O(N)
//Space Complexity = O(1)
