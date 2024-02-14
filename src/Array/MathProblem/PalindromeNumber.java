package Array.MathProblem;

public class PalindromeNumber {
    public static void main(String[] args) {
    int x = 121;
    boolean result = PalindromeNumber.isPalindrome(x);
    System.out.println(result);

    }
    public static boolean isPalindrome(int x) {
        int reverse = 0 ;
        int temp = x ;
        while( x > 0){
            int pop =  x % 10;
            x = x / 10;
            reverse = reverse * 10 + pop;
        }
        return reverse == temp;

    }
}

//Time Complexity = O(log10(x))
//Space Complexity = O(n)

