package binarysearch;

public class Search2DMatrix {

    public static void main(String[] args) {
        int[][] arr = {{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
        int k =3;

        System.out.println(searchMatrix(arr, k));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {

        for(int i=0; i<matrix.length; i++){
            if(matrix[i][matrix[i].length-1] >= target){
                return binarySearch(matrix[i], target);
            }
        }
        return false;
    }

    public static boolean binarySearch(int[] arr, int t){
        int st =0;
        int end = arr.length-1;

        while(st<=end){
            int mid = st+(end-st)/2;

            if(arr[mid] == t){
                return true;
            }else if(arr[mid] > t){
                end = mid-1;
            }else{
                st = mid+1;
            }
        }
        return false;
    }
}
