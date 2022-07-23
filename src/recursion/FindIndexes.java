package recursion;

import java.util.ArrayList;
import java.util.List;

public class FindIndexes {
    public static void main(String[] args) {
        int[] arr = {2,3,2,3,5,3};
        System.out.println(findIndex(arr, 3, 0));
    }

    public static ArrayList<Integer> findIndex(int[] arr, int t, int curIndex){
        ArrayList<Integer> l = new ArrayList<>();
        if(arr.length == curIndex){
            return l;
        }
        if(arr[curIndex] == t){
            l.add(curIndex);
            ArrayList<Integer> addList = findIndex(arr, t, curIndex+1);
            l.addAll(addList);
            return l;
        }
        return findIndex(arr, t, curIndex+1);
    }
}
