package Array.BitManipulation;

import java.util.Arrays;

public class CountingBits {
    public static void main(String[] args) {
     int n = 2;
     int[] result = CountingBits.countBits(n);
        System.out.println(Arrays.toString(result));
    }
    public static int[] countBits(int n) {
        int[] result = new int[n+1];
        result[0] = 0;
        for(int i = 1 ; i <=n ; i++){
            result[i] = (result[i>>1])+i%2;
        }
        return result;
    }
}


