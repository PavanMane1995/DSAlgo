package binarysearch;

import java.util.*;

public class KthWeakestRow {

    public static void main(String[] args) {
        int[][] mat ={{1,1,0,0,0}, {1,1,1,1,0},
        {1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
       int k = 6;
        int[] aaa = kWeakestRows(mat, k);
        for(Integer a : aaa){
            System.out.println(a);
        }
    }
    public static int[] kWeakestRows(int[][] mat, int k) {
        HashMap<Integer, Integer> tm1 = new HashMap<>();
        for(int i=0; i<mat.length; i++){
            tm1.put(i, countS(mat[i]));
        }
        //System.out.println(tm1);
        HashMap<Integer, Integer> tm =sortByValue(tm1);
        int[] arr = new int[k];
        int count = 0;
        for(Map.Entry<Integer, Integer> map: tm.entrySet()){
            if(count == k){
                break;
            }
            arr[count++] = map.getKey();
        }
        return arr;
    }

    public static int countS(int[] arr){
        int c = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                c++;
            }else{
                break;
            }

        }
        return c;
    }

    public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<Integer, Integer> > list =
                new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
}
