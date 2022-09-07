package binarysearch;

public class FindPeek {

    public static void main(String[] args) {
        int[] arr ={1,2,1,3,5,6,4};
        System.out.println(find(arr));
    }

    public static int find(int[] num){
        int low = 0;
        int high = num.length-1;

        while(low < high)
        {
            int mid = low + (high-low)/2;
            if(num[mid] < num[mid+1])
                low = mid+1;
            else
                high = mid;
        }
        return low;
    }

}
