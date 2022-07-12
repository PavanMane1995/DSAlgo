package recursion;

public class Factorial {
    public static void main(String[] args) {
        //printFactorial(1, 1);
        System.out.println(printFactorial2(5));
    }

    static void printFactorial(int n,  int total){
        if(n==0){
            System.out.println(total);
            return;
        }
        total = total*n;
        printFactorial(n-1, total);
    }

    static int printFactorial2(int n){
        if(n == 0){
            return 1;
        }
        System.out.println(n);
        return n*printFactorial2(n-1);
    }
}
