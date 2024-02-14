package Array.BitManipulation;

public class ReverseBits {
    public static void main(String[] args) {
        long n = 0b00000010100101000001111010011100L; // Use the binary literal prefix 0b and suffix with 'L'
        long result = ReverseBits.reverseBits(n);
        System.out.println(result);
    }
    public static int reverseBits(long n) {
        int num = 0;
        int i = 32;
        while (i > 0){
            int x = 1;

            if ((x & n) != 0){
                num = (num << 1) +1;
            }else{
                num = (num << 1);
            }

            n = n >> 1;
            i--;

        }
        return num;
    }
}