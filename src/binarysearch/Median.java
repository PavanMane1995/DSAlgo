package binarysearch;

public class Median {
    public static void main(String[] args) {
        int[] arr1 = {1, 2};
        int[] arr2 = {3, 4};
        System.out.println(findMedianSortedArrays(arr1,arr2));
    }
        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int[] arr =sortAndDivide(nums1, nums2);
            mergeSort(arr, 0, arr.length - 1);
            if(arr.length%2 == 1){
                return arr[arr.length/2];
            }else {
                return (double) (arr[arr.length/2]+ arr[(arr.length-1)/2])/2;
            }
        }

        public static int[] sortAndDivide(int[] nums1, int[] nums2){
            int[] arrSort = new int[nums1.length + nums2.length];
            for(int i=0; i<nums1.length; i++){
                arrSort[i] = nums1[i];
            }
            int count = nums1.length;
            for(int j=0; j<nums2.length; j++){
                arrSort[count++] = nums2[j];
            }
            return arrSort;
        }

        static void merge(int arr[], int left, int middle, int right)
        {
            int low = middle - left + 1;                    //size of the left subarray
            int high = right - middle;                      //size of the right subarray

            int L[] = new int[low];                             //create the left and right subarray
            int R[] = new int[high];

            int i = 0, j = 0;

            for (i = 0; i < low; i++)                               //copy elements into left subarray
            {
                L[i] = arr[left + i];
            }
            for (j = 0; j < high; j++)                              //copy elements into right subarray
            {
                R[j] = arr[middle + 1 + j];
            }


            int k = left;                                           //get starting index for sort
            i = 0;                                             //reset loop variables before performing merge
            j = 0;

            while (i < low && j < high)                     //merge the left and right subarrays
            {
                if (L[i] <= R[j])
                {
                    arr[k] = L[i];
                    i++;
                }
                else
                {
                    arr[k] = R[j];
                    j++;
                }
                k++;
            }

            while (i < low)                             //merge the remaining elements from the left subarray
            {
                arr[k] = L[i];
                i++;
                k++;
            }

            while (j < high)                           //merge the remaining elements from right subarray
            {
                arr[k] = R[j];
                j++;
                k++;
            }
        }


        static void mergeSort(int arr[], int left, int right)       //helper function that creates the sub cases for sorting
        {
            int middle;
            if (left < right) {                             //sort only if the left index is lesser than the right index (meaning that sorting is done)
                middle = (left + right) / 2;

                mergeSort(arr, left, middle);                    //left subarray
                mergeSort(arr, middle + 1, right);               //right subarray

                merge(arr, left, middle, right);                //merge the two subarrays
            }
        }

    static void display(int arr[])                 //display the array
    {
        for (int i=0; i<arr.length; ++i)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

//[1, 1,2, 2, 2 ,2,  4, 7, 0, 1]
