package math;

public class Prime {

    public static void main(String[] args) {
        System.out.println(isPrimeNumber(23));

        //Print all prime numbers from 1
        for(int i=0; i<20; i++){
            System.out.println(i+ "->" +isPrimeNumber(i));
        }

    }

    public static boolean isPrimeNumber(int n){
        if(n ==0 || n==1){
            return false;
        }
        int temp = 2;
        //Check till square root of given number
        while(temp * temp <= n){
            if(n%temp ==0){
                return false;
            }
            temp++;
        }
        return true;
    }


}
