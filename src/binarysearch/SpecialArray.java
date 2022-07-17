package binarysearch;

//Leetcode
public class SpecialArray {

    public static void main(String[] args) {
        int[] arr = {0,4,3,0,4};
        System.out.println(specialArray(arr));
    }

    public static int specialArray(int[] nums) {

        int end = nums.length-1;
        for(int i=0; i<=end+1; i++){
            int st =0;
            int count =0;
            while(st<=end){
                if(i <= nums[st++]){
                    count++;
                }
            }
            if(count==i){
                return i;
            }
        }
        return -1;

    }
}
