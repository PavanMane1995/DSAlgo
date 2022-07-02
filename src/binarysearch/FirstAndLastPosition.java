package binarysearch;

public class FirstAndLastPosition {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        System.out.println("Start index de -> " +binarySearch(arr,5, true));
        System.out.println("End index de -> " +binarySearch(arr,5, false));
    }
    
    private static int  binarySearch(int[] arr, int target, boolean findstart){
        int index =-1;
        int st=0,end= arr.length;
        while(st<=end){
            int mid=st+ (end-st)/2;
            System.out.println(findstart +"-"+ mid);
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
