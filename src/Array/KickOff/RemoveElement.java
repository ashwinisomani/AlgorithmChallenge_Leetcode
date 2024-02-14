package Array.KickOff;

public class RemoveElement {
    public static void main(String[] args) {
     int[]  numbers  = {3,2,2,3};
     int val = 3;

     int result = RemoveElement.removeElement(numbers,val);
     System.out.println(result);

    }
    public static int removeElement(int[] nums, int val) {
        int begin = 0;
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i] != val){
                nums[begin++] = nums[i];
            }
        }
        return begin;
    }
}

//Time Complexity = O(N)
//Space Complexity = O(1)

