package recursion;

import java.util.ArrayList;

public class SubsetUsingLoop {

    /**
     * Input Arr = [1, 2, 3];
     * Output Arr = [[]]
     *
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3};
        System.out.println(subset(arr));
        System.out.println(subsetDuplicateRemoval(arr));
    }

    /**
     *  Create Subsets of given array
     */
    static ArrayList<ArrayList<Integer>> subset(int[] arr){

        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int k : arr) {
            int size = outer.size();
            for (int j = 0; j < size; j++) {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(k);
                outer.add(inner);
            }
        }
    return outer;


    }

    /**
     * Create subsets and remove duplicate pairs.
     */
    static ArrayList<ArrayList<Integer>> subsetDuplicateRemoval(int[] arr){

        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int i=0; i< arr.length; i++){
            int size = outer.size();
            if(i<arr.length-1 && arr[i] == arr[i+1]){
                continue;
            }
            for(int j=0; j<size; j++){
                ArrayList<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;


    }
}
