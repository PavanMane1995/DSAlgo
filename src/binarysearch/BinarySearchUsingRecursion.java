package binarysearch;

import java.util.Arrays;

public class BinarySearchUsingRecursion {

    public static void main(String[] args) {
        int[] arr = {2,3,4,6,8,9};
        System.out.println(search(arr, 100, 0, arr.length-1));
    }

    public static int search(int arr[], int target, int st, int end){


        if(st <end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] > target) {
                return search(arr, target, st, mid - 1);
            } else if (arr[mid] < target) {
                return search(arr, target, mid + 1, end);
            }
            return mid;
        }
        return -1;




    }
}
