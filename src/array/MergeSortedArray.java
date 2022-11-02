package array;

import sun.security.util.ArrayUtil;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {

        int[] a = {4,0,0,0,0,0};
        int[] b = {1,2,3};
        int m=1, n=3;
        merge(a,m,b,n);

        System.out.println(Arrays.toString(a));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m <0){
            int c =0;
            for(int x: nums2){
                nums1[c++] = x;
            }
            return;
        }else if(n == 0) return;

        int i=0, j=0;
        int[] res = new int[m+n];
        int c=0;
        while(i<m || j<n){

            if(i >= m){
                res[c++] = nums2[j++];
            }else if(j >= n){
                res[c++] = nums1[i++];
            }
            else if(nums1[i] == nums2[j]){
                res[c++] = nums1[i++];
                res[c++] = nums2[j++];
            }else if(nums1[i] > nums2[j]){
                res[c++] = nums2[j++];
            }else{
                res[c++] = nums1[i++];
            }
        }
        int a1 = 0;
        for(int x:res){
            nums1[a1++] = x;
        }


    }
}
