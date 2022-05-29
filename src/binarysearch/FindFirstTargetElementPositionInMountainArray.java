package binarysearch;

public class FindFirstTargetElementPositionInMountainArray {

    public static void main(String[] args) {
        int[] arr = {2, 11,22, 12, 10, 8, 3, 1};
        int target = 11;
        int peek =findPeek(arr);
        //System.out.println(peek);
        int asec = findFirstIndex(arr, 0, peek, target, false);
        if(asec != -1)
            System.out.println(asec);
        else
        System.out.println(findFirstIndex(arr, peek+1, arr.length, target, true));

    }

    public static int findPeek(int[] arr){

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
    public static int findFirstIndex(int[] arr,int st, int end, int t, boolean flag){

        while(st<=end){
            // System.out.println(st);
            int mid = st+ (end-st)/2;

            if(t == arr[mid])
                return mid;
            else if(arr[mid] <t)
                if(flag)
                    end= mid-1;
                else
                    st = mid+1;
            else if(arr[mid] > t){
                if(flag)
                    st=mid+1;
                else
                    end= mid-1;
            }
        }
        return -1;
    }
}
