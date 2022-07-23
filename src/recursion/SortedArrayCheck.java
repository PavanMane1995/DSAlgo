package recursion;

public class SortedArrayCheck {

    public static void main(String[] args) {
        int[] arr = {1,3,7,5,6};
        System.out.println(isSortedArray(arr, 0));
    }

    public static boolean isSortedArray(int[] arr, int curIndex){
        if(curIndex == arr.length-1 ){
            return true;
        }

        if(arr[curIndex] < arr[curIndex+1]){
            return isSortedArray(arr, curIndex+1);
        }
        return false;
    }

}
