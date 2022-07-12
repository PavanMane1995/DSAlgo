package recursion;

public class SumOfNumber {
    /*Ex. input = 1464;
    output = 1+4+6+4 = 15*/
    public static void main(String[] args) {
        System.out.println(addNumber(346));
    }

    static int addNumber(int n){
        if(n == 0){
            return 0;
        }
        int t = n%10;
        return t + addNumber(n / 10);

    }

}
