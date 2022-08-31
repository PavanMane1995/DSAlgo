package practice;

import java.util.Arrays;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int[] arr = {2,2,2,3, 3,4,4,4};
        int c = removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(c);
    }

    public static int removeDuplicates(int[] nums) {

        int i=0;
        for(int n : nums){

            if(i ==0 || n > nums[i-1]){
                nums[i++] = n;
            }
        }
        return i;
    }
}
