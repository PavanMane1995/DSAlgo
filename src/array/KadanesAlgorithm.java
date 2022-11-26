package array;


//53. Maximum Subarray
public class KadanesAlgorithm {

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(sumOfContigeaousArray(arr));
    }

    public static int sumOfContigeaousArray(int[] arr){
        int sum =0, max = arr[0];

        for(int i=0; i< arr.length; i++){
            sum = sum + arr[i];
            max = Math.max(sum, max);

            if(sum < 0)
                sum = 0;
        }
        return max;
    }
}
