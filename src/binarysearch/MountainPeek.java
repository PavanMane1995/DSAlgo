package binarysearch;

//Find the peek of tha array of unique values
public class MountainPeek {


    public static void main(String[] args) {
        int[] arr = {2, 11,22, 12, 10, 8, 3, 1};
        System.out.println(arr[searchMountain(arr)]);
    }

    public static int searchMountain(int[] arr){

        int st = 0, end = arr.length;
        while(st<end){
            int mid = st + (end-st)/2;

            if(arr[mid] <arr[mid+1]){
                st = mid+1;
            }else if(arr[mid] > arr[mid+1]){
                end = mid;
            }
        }
        return end;
    }

}
