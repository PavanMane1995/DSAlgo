package recursion.sorting;


import java.util.Arrays;

/**
 * Recurrence relation T(N) = T(K) + T(N-K-1) + O(n);
 * WorstCase -> when K=first/last element of array O(n^2)
 * BestCase -> when K=middle element of an array O(nlog^n)
 */

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {5,4,6,3,2,1};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int low, int high){
        if(low > high){
            return;
        }

        int s = low;
        int e = high;
        int mid = s+(e-s)/2;
        int pivot = arr[mid];

        while(s <= e){
            while(arr[s]< pivot){
                s++;
            }
            while(arr[e] > pivot){
                e--;
            }
            if(e>=s){
                int t = arr[s];
                arr[s] = arr[e];
                arr[e] = t;
                s++;
                e--;
            }

        }
        sort(arr, low,e);
        sort(arr, s,high);
    }

}
