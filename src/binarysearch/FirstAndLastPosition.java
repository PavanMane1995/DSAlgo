package binarysearch;

public class FirstAndLastPosition {

    public static void main(String[] args) {

        int[] arr = {2, 7, 7, 7, 11, 13, 16};
        System.out.println("Start index de -> " +binarySearch(arr,12, true));
        System.out.println("End index de -> " +binarySearch(arr,12, false));
    }
    
    private static int  binarySearch(int[] arr, int target, boolean findstart){
        int index =-1;
        int st=0,end= arr.length;
        while(st<=end){
            int mid=st+ (end-st)/2;
            if (arr[mid]==target) {
                index = mid;
                if(findstart)end = mid - 1;
                else st = mid+1;
            }
            else if (arr[mid]>target){
                end=mid-1;
            }
            else if (arr[mid]<target){
                st=mid+1;
            }

        }
        return index;
    }
}
