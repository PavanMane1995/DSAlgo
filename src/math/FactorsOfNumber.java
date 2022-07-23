package math;

public class FactorsOfNumber {

    //factor of 10 -> 1, 2, 5, 10;
    public static void main(String[] args) {
       // factors(10);
       // factorsWithRecusrion(20, 1);
        factors2(20);
    }

    //Using loop
    public static void factors(int n){
        int i=1;
        while(i<=n){
            if(n%i ==0){
                System.out.println(i);
            }
            i++;
        }
    }
    //Using recusrion
    public static void factorsWithRecusrion(int n, int i){
        if(i>n) {
            return;
        }
        if(n%i ==0){
            System.out.println(i);
        }
         factorsWithRecusrion(n, ++i);
        }

        //O(Sqrt(n))
    public static void factors2(int n){
        int i=1;
        while(i<=Math.sqrt(n)){
            if(n%i ==0){
                System.out.println(i + "\n"+n/i);
            }
            i++;
        }
    }

}
