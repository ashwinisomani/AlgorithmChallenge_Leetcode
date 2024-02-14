package Array.MathProblem;

public class HappyNumber {
    public static void main(String[] args) {
       int n = 19;
       boolean result = HappyNumber.isHappy(n);
        System.out.println(result);

    }
    public static boolean isHappy(int n) {
        while(n != 1 && n!= 4){
            n = getNext(n);
        }
        return n ==1;
    }

    public static int getNext(int n ){
        int totalSum = 0;
        while(n != 0){
            int pop = n %10;
            n/=10;

            totalSum += pop*pop;
        }
        return totalSum;
    }
}


