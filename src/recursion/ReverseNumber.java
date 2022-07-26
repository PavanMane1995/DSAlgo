package recursion;

public class ReverseNumber {

    static int sum = 0;
    public static void main(String[] args) {
        //reverseNumb(543122);
       // System.out.println(sum);
        //System.out.println(reverseNumber(543));

        //System.out.println((int) Math.log10(134));
        reverseNumb(43542);
    }

    //Method 1
    public static void reverseNumb(int n){
        if(n==0){
            System.out.println(sum);
            return;
        }
        int a = n%10;
        sum = (sum *10) + a;
        reverseNumb(n/10);
    }
    public static int reverseNumb2(int n){
        int digit = (int)(Math.log10(n)+1);
        return helper(n, digit);
    }

    private static int helper(int n, int digit) {
        if(n%10 == n){
            return n;
        }

        int a = n%10;
        return (int)(a* Math.pow(10, digit-1) + helper(n/10, digit-1));
    }

}
