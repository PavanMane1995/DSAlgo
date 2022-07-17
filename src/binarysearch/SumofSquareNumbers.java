package binarysearch;


/**
*@LeetCode-Problem
*Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.
*/
public class SumofSquareNumbers {
    public static void main(String[] args) {
        System.out.println(judgeSquareSum(99999999));
        System.out.println(judgeSquareSum2(8));
    }

    public static boolean judgeSquareSum(int c) {
        long low = 0;
        long high = c;

        while(low <= high){
            long cur = (low*low) + (high*high) ;
            if(cur == c){
                return true;
            }else if(cur > c){
                high --;
            }else{
                low++;
            }
        }
        return false;
    }

    //Binary search approach

        public static boolean judgeSquareSum2(int c) {
            for (long a = 0; a * a <= c; a++) {
                int b = c - (int)(a * a);
                if (binary_search(0, b, b))
                    return true;
            }
            return false;
        }
        public static boolean binary_search(long s, long e, int n) {
            if (s > e)
                return false;
            long mid = s + (e - s) / 2;
            if (mid * mid == n)
                return true;
            if (mid * mid > n)
                return binary_search(s, mid - 1, n);
            return binary_search(mid + 1, e, n);
        }

}
