package binarysearch;

//Medium question
public class RotatedBinarySearch {

    public static void main(String[] args) {
        int[] arr = {11, 12, 22, 31, 3, 4, 5 , 6, 7};
        int end = arr.length-1;
       System.out.println(search(arr, 0, end, 6));
    }

    static int findPivot(int[] arr){
        int st = 0;
        int end = arr.length-1;

        while(st <= end){
            int mid = st + (end - st)/2;

            if(mid < end && arr[mid] >arr[mid+1]){
                return mid;
            }
            if(mid > st && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] <= arr[st]){
                end = mid -1;
            }else {
                st = mid +1;
            }
        }

        return -1;
    }

    static int search(int[] arr, int st, int end, int t){

        int pivot = findPivot(arr);
        System.out.println(pivot);
        //case 0
        if(pivot == -1){
            return binarySearch(arr, st, end, t);
        }

        //case 1
        if(arr[pivot] == t){
            return pivot;
        }

        //case 3
        if(arr[st] <= t)return binarySearch(arr, st, pivot, t);
        else if(t <= arr[end]) return binarySearch(arr, pivot+1, end, t );
        return -1;
    }

    static int binarySearch(int[] arr, int st, int end, int t){
        //{6, 11, 12, 22, 31}
        while (st<=end){
            int mid = st + (end-st)/2;
            if(arr[mid] == t)return mid;
            else if(arr[mid]>t)end = mid -1;
            else if(arr[mid] < t) st = mid +1;
        }
        return -1;
    }
}
