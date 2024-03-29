package Array.KickOff;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        int[] result = IntersectionOfTwoArray.intersection(nums1,nums2);
        System.out.println(Arrays.toString(result));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int i = 0 ; i< nums1.length ; i++){
            set1.add(nums1[i]);
        }

        for(int i = 0 ;i<nums2.length;i++){
            if(set1.contains(nums2[i])){
                set2.add(nums2[i]);
            }
        }
        int[] result = new int[set2.size()];
        int i = 0;
        for(int num : set2){
            result[i++] = num;
        }
        return result;
    }
}

//Time Complexity = O(N+M)
//Space Complexity = O(N+M)

