package math;

public class KthPositiveNumber {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        //int[] arr = {2,3,4,7,11};
        System.out.println(findKthPositive(arr, 2));
    }

    public static int findKthPositive(int[] arr, int k) {

        int[] newArr = new int[arr[arr.length-1]+1];
        int count=0;
        for(int i=0; i<= arr.length-1; i++){
            newArr[arr[i]]++;
        }
        int i=1;
        while(count < k){
            if(i > newArr.length-1){
                i++;
                count++;
            }
            else if(newArr[i++] < 1){
                count++;
            }

        }
        return i-1;
    }

}
