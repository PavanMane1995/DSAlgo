package recursion;

import java.util.ArrayList;

public class SubsetUsingLoop {

    /**
     * Input Arr = [1, 2, 3];
     * Output Arr = [[]]
     *
     */
    public static void main(String[] args) {
        int[] arr = {4,4,4,1,4};
       // System.out.println(subset(arr));
        System.out.println(subsetDuplicateRemoval2(arr));
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
                if(!outer.get(j).containsAll(inner)){
                    outer.add(inner);
                }
                //outer.add(inner);
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


    static ArrayList<ArrayList<Integer>> subsetDuplicateRemoval2(int[] arr){
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int tSize =0;
        for(int i=0; i< arr.length; i++){
            int size = outer.size();
            if(i>0 &&arr[i] != arr[i-1]){
                tSize =0;
            }
            for(int j=tSize; j<size; j++){
                ArrayList<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
            tSize = size;
        }
        return outer;
    }
}
