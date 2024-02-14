package Array.MathProblem;

public class PowXN {
    public static void main(String[] args) {
      double  x = 2.00000;
      int n = 10;

      double result = PowXN.myPow(x,n);
        System.out.println(result);
    }
    public static double myPow(double x, int n) {
        double answer = 1.0;
        long N = n;
        if(N < 0){
            N = -N;
        }
        while(N>0){
            if(N % 2 != 0){
                answer = answer * x;
                N = N-1;
            }
            else{
                x = x*x;
                N = N/2;
            }
        }
        if(n<0)
            answer = (double) (1.0)/(double)(answer);
        return answer;
    }
}

