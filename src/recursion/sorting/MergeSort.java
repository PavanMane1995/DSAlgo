package recursion.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] res = mergeSort(new int[]{5,6,3,34,2,0,1});
        Arrays.stream(res).forEach(System.out::println);
    }

    public static int[] mergeSort(int arr[]){
        if(arr.length ==1){
            return arr;
        }

        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int l1 = 0, l2=0;
        int[] result = new int[left.length+right.length];
        int i=0;
        while (l1<left.length || l2 < right.length){
            if(l1 >=left.length){
                result[i++] = right[l2++];
            }else if(l2>=right.length){
                result[i++] = left[l1++];
            }else if(left[l1] > right[l2]){
                result[i++] = right[l2++];
            }else{
                result[i++] = left[l1++];
            }
        }
        return result;
    }
}
