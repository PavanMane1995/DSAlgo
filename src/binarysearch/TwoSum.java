package binarysearch;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*Input: nums = [2,7,11,15], target = 9
Output: [0,1]
*/
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int t=9;
       int[] num = new int[2];
        /* int sec =-1;
        for(int i=0; i<arr.length; i++){
             sec =search(arr, i+1, t-arr[i]);
            if(sec != -1) {
                num[0] = i;
                num[1] = sec;
                break;
            }
        }*/
        num = twoSum(arr, t);
        System.out.println(Arrays.toString(num));
    }

    public static int search(int[] arr,int st, int t){
        int end =arr.length-1;

        while(st<=end){
            if(arr[st] == t){
                return st;
            }
            st++;
        }
        return -1;
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i);
        }
        return result;
    }
}
