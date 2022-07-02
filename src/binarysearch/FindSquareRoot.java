package binarysearch;

public class FindSquareRoot {

    public static void main(String[] args) {
        System.out.println(findSqurt(8));
    }

    private static int findSqurt(int n){
        if(n==0 || n==1){  //12345678
            return 1;
        }
        int st = 0, end = n;
        int ans=-1;
        while(st <= end){
            int mid = st + (end-st)/2;
            System.out.println(mid);
            if(mid <= n/mid){
                ans = mid;
                st = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
}
