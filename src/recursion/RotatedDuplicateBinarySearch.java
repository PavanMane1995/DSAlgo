package recursion;

import java.util.*;

public class RotatedDuplicateBinarySearch {

    public static void main(String[] args) {
        int[] arr ={1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};

        int end = arr.length-1;
        int target = 1;
       // System.out.println(pivot(arr, 0, end));
        System.out.println(findMin(arr));
        //System.out.println(search(arr, target));
    }

    public static int findMin(int[] nums) {
        int end = nums.length-1;
        int st =0;
        int p = pivot(nums, st,end);
        if(p==end ){
            while(end !=0 && st<end && nums[st] == nums[end]){
                st++;
            }
            return nums[st];
        }else{
            return nums[p+1];
        }
    }

    static int search(int[] nums, int target){
        int st =0;
        int end = nums.length-1;
        int pivot = pivot(nums, st, end);
        if(pivot == -1){
            return -1;
        }
        if(nums[pivot] == target){
            return pivot;
        }else if(st == pivot ){
            return binarySearchRecusrsion(nums, st+1, end, target);
        }else if(end == pivot){
            return binarySearchRecusrsion(nums, st, end-1, target);
        }else if(nums[pivot] > target && nums[st] <= target){
            return binarySearchRecusrsion(nums, st, pivot-1, target);
        }else if(nums[pivot] > target && nums[st] >= target){
            return binarySearchRecusrsion(nums, pivot+1, end, target);
        }else{
            return -1;
        }
    }

    public static int pivot(int[] arr, int st, int end){
        // [2,5,6,0,0,1,2]

        if(st>end){
            return -1;
        }
        if(st == end){
            return st;
        }
        int mid = st+(end-st)/2;

        if(mid >st &&arr[mid] < arr[mid-1]){
            return mid-1;
        }
        else if(mid < end && arr[mid] > arr[mid+1]){
            return mid;
        }
        else if(arr[mid] < arr[st]){
            return pivot(arr, st, mid-1);
        }else {
            return pivot(arr, mid+1, end);
        }
    }

    public static int binarySearchRecusrsion(int[] arr, int st, int end, int t) {

        if (st > end) {
            return -1;
        }
        int mid = st + (end - st) / 2;
        if (arr[mid] == t) {
            return mid;
        } else if (arr[st] == arr[end]){
            return binarySearchRecusrsion(arr, st+1, end-1, t);
        }else if(arr[mid]> t){
            return binarySearchRecusrsion(arr, st, mid-1, t);
        }else{
            return  binarySearchRecusrsion(arr, mid+1,end, t);
        }
    }

    public static int pivot1(int[] arr, int st, int end){
       //[10,1,10,10,10]
        if(st>end){

            return end;
        }
        int mid = st + (end-st)/2;

        if(mid < end && arr[mid]> arr[mid+1]){
            return mid;
        }else if(mid > st && arr[mid] < arr[mid-1]){
            return mid-1;
        }else if(arr[mid] > arr[st]){
            return pivot1(arr, mid+1 , end);
        }else{
            return pivot1(arr, st, mid-1);
        }
        
    }
    
    
}
