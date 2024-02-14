package Array.KickOff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArrayII {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        int[] result = IntersectionOfTwoArrayII.intersection(nums1,nums2);
        System.out.println(Arrays.toString(result));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int num : nums1) {
            list1.add(num);
        }

        for (int num : nums2) {
            if (list1.contains(num)) {
                list2.add(num);
                int x = list1.indexOf(num);
                list1.remove(x);

            }
        }

        int[] res = new int[list2.size()];
        int i = 0;
        for (int num : list2) {
            res[i++] = num;
        }

        return res;
    }
}

