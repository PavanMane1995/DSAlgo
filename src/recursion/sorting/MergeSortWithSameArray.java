package recursion.sorting;

import java.util.Arrays;

public class MergeSortWithSameArray {

    public static void main(String[] args) {
    int[] arr = new int[]{5,6,3,34,2,0,1};
    mergeSort(arr,0, arr.length);
    Arrays.stream(arr).forEach(System.out::println);
    }

    public static void mergeSort(int arr[], int st, int end){
        if(end-st ==1){
            return;
        }

        int mid = (end+st)/2;

        mergeSort(arr,st,mid);
        mergeSort(arr,mid,end);

        int[] merged = merge(arr,st, mid,end);
        int c=0;
        while (c < merged.length){
            arr[st+c] = merged[c];
            c++;

        }
    }

    private static int[] merge(int[] arr, int i, int m, int j) {
        int l1 = i, l2=m;
        int[] result = new int[j-i];
        int k=0;
        while (l1<m || l2 < j){
            if(l1 >=m){
                result[k++] = arr[l2++];
            }else if(l2>=j){
                result[k++] = arr[l1++];
            }else if(arr[l1] > arr[l2]){
                result[k++] = arr[l2++];
            }else{
                result[k++] = arr[l1++];
            }
        }
        return result;
    }
}
