package Array.KickOff;

public class IncreasingTripletSequence {
    public static void main(String[] args) {
    int[] nums = {2,1,5,0,4,6};

    boolean result = IncreasingTripletSequence.increasingTriplet(nums);
        System.out.println(result);
    }
    public static boolean increasingTriplet(int[] nums) {
        int first_num  = Integer.MAX_VALUE;
        int second_num = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n <= first_num) {
                first_num = n;

            } else if (n <= second_num) {
                second_num = n;
            }
            else {
                return true;
            }
        }
        return false;
    }
}

//Time Complexity = O(N)
//Space Complexity = O(1)
