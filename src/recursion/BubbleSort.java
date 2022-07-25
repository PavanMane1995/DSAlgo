package recursion;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {4,3,5,2,1};
        sorted(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    static void sorted(int[] arr,int i, int j){
        if(i==0){
            return;
        }
        if(i>j){
            if(arr[j] > arr[j+1]){
                int t = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = t;

            }
            sorted(arr,i,j+1);
        }
            sorted(arr,i-1, 0);

    }
}
