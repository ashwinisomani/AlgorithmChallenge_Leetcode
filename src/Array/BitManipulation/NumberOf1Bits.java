package Array.BitManipulation;

public class NumberOf1Bits {
    public static void main(String[] args) {
    long n = 0b00000000000000000000000000001011L;
    long result = NumberOf1Bits.hammingWeight(n);
        System.out.println(result);
    }
    public static int hammingWeight(long n) {
        int count = 0;

        while  (n != 0){
            count++;
            n = n & (n-1) ; // bitwise operation do rightshift
        }
        return count;
    }
}

//Time Complexity = O(1)  //32 Number we have to check
//Space Complexity = O(1)

