package math;

//https://leetcode.com/problems/ugly-number-ii/
public class UglyNumber {

    public static void main(String[] args) {
        System.out.println(nthUglyNumber(13));
    }

    public static int nthUglyNumber(int n) {
        if(n<=6){
            return n;
        }
        int i=7;
        int count =7;
        while(count <= n){

            if(!isPrime(i)){
                count++;
            }
            i= i+1;
        }
        return i-1;
    }

    public static boolean isPrime(int n){
        int st=2; int end = n/2;
        while(st <= end){
            if(st*end == n){
                return false;
            }else if(st*end > n){
                end--;
            }else{
                st++;
            }
        }
        return true;
    }
}
