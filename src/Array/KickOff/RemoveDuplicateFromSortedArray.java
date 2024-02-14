package Array.KickOff;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
     int[] numbers = {1,1,2,2,2,3,3,4,4,4,4,5};
     int result = RemoveDuplicateFromSortedArray.removeDuplicates(numbers);
     System.out.println(result);
    }
    public static int removeDuplicates(int[] nums) {
        int begin = 1;
        for(int i = 1 ; i< nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[begin] = nums[i];
                begin++;
            }
        }
        return begin;
    }
}

//Time Complexity = O(N)
//Space Complexity = O(1)

