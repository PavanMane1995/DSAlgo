package recursion;

public class BinarySearchRecursion {

    public static void main(String[] args) {
        int[] arr =  {2, 4, 6, 7, 11, 13, 16};
            int end = arr.length-1;
        System.out.println(binarySearch(arr, 0, end, 2));
    }

    static int binarySearch(int[] arr, int s, int e, int t){

        if(s > e){
            return -1;
        }

        int m = s+ (e-s)/2;
        if(arr[m] == t){
            return m;
        }
        else if(arr[m] > t){
            return binarySearch(arr, s, m-1, t);
        }
        return binarySearch(arr, m+1, e, t);
    }
}
