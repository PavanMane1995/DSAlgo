package recursion;

public class ReverseNumber {

    static int sum = 0;
    public static void main(String[] args) {
        reverseNumb(5432);
        System.out.println(sum);
        //System.out.println(reverseNumber(543));

        System.out.println((int) Math.log10(13));
    }

    //Method 1
    public static void reverseNumb(int n){
        if(n==0){
            return;
        }
        int a = n%10;
        sum = (sum *10) + a;
        reverseNumb(n/10);


    }

}
