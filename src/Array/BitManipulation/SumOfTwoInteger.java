package Array.BitManipulation;

public class SumOfTwoInteger {
    public static void main(String[] args) {
    int a = 4;
    int b = 5;
     int result =  SumOfTwoInteger.getSum(a,b);
        System.out.println(result);
    }
    public static int getSum(int a, int b) {

        while(b != 0){
            int result = a ^ b;
            int carry = ( a & b) << 1;
            a = result;
            b = carry;
        }

        return a;
    }
}

//Time Complexity = O(1)
//Space Complexity = O(1)


