package binarysearch;

public class FindPositionInInfiniteArray {

    public static void main(String[] args) {
        int[] arr = {2, 7, 7, 7, 11, 13, 16, 18, 20, 22, 30, 32, 32, 33,  33, 50};
        findRange(arr, 30);
    }

    public static void findRange(int[] arr, int target){
        int start = 0, end =1;
        while(arr[end] < target){
            int temp = start;
            start = end+1;
            end = (end+temp)*2;
           // System.out.println(end);
        }
       System.out.println(binarySearch(arr, start, end, target));
    }

    public static int binarySearch(int[] arr,int st, int end, int t){

        while(st<=end){
           // System.out.println(st);
            int mid = st+ (end-st)/2;

            if(t == arr[mid])
                return mid;
            else if(arr[mid] <t)
                st = mid+1;
            else if(arr[mid] > t){
                end= mid-1;
            }
        }
        return -1;
    }
}
