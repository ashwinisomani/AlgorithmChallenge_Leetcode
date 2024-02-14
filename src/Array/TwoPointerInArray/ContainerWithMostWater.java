package Array.TwoPointerInArray;

import Array.KickOff.ContainDuplicateII;

public class ContainerWithMostWater {
    public static void main(String[] args) {
      int[] height = {1,8,6,2,5,4,8,3,7};
      int result = ContainerWithMostWater.maxArea(height);
      System.out.println(result);

    }
    public static int maxArea(int[] height) {
        int a_pointer = 0;
        int b_pointer = height.length -1;
        int max = 0;

        while(a_pointer < b_pointer){
            if(height[a_pointer] < height[b_pointer]){
                max = Math.max(max, height[a_pointer] *( b_pointer - a_pointer));
                a_pointer++;
            }
            else{
                max = Math.max(max, height[b_pointer] * (b_pointer - a_pointer));
                b_pointer--;
            }
        }
        return max;
    }
}

//Time Complexity = O(N) 'Single Pass
//Space Complexity = O(1)
