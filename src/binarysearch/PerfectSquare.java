package binarysearch;

public class PerfectSquare {

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(5));
    }

    public static boolean isPerfectSquare(int num) {
        if(num == 1){
            return true;
        }
        int st = 1;
        int end = num;


        while(st<=end){
            long mid = st+(end-st)/2;
            System.out.println(mid);

            if(mid*mid == num){
                return true;
            }else if(mid*mid < num){
                st = (int)mid+1;
            }else{
                end = (int)mid-1;
            }
        }
        return false;
    }
}
