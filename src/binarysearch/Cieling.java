package binarysearch;

public class Cieling {
    public static void main(String[] args) {

        int[] arr = {2, 7, 7, 9, 11, 13, 16};
        System.out.println(getCeiling(arr,8));
    }

    static int getCeiling(int[] arr,int target){

        int st=0,end= arr.length;
        while(st<=end){
            int mid=st+ (end-st)/2;     //2
           /* if (st==end){
                if (arr[mid]==target)  //9
                    return target;
                return arr[end+1];
            }*/
            if (arr[mid]==target)  //9
                return target;
            /*else if(st==end)
                return arr[end+1];*/
            else if (arr[mid]>target){
                end=mid-1;              //3
            }
            else if (arr[mid]<target){
                st=mid+1;               //2 3
            }

           //return -1;
        }
        return arr[end];
    }
}
