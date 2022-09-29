package math;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatenationofConsecutiveBinaryNumbers {

    public static void main(String[] args) {

        int n=42;
        List<List<Integer>> list = new LinkedList<>();
        for (int i=1; i<= n; i++){
            List<Integer> a =convertToBinary(i);
            Collections.reverse(a);
            list.add(a);

        }
        List<Integer> mainList = flattenListOfListsImperatively(list);
        //List<Integer> mainList =list.stream().flatMap(Collection :: stream).collect(Collectors.toList());
        Collections.reverse(mainList);
        System.out.println(convertToDecimal(mainList));
        System.out.println(mainList);
    }

    public static List<Integer> convertToBinary(int n){
        List<Integer> list = new LinkedList<>();
        while(n > 0){
            if(n%2 == 0){
                list.add(0);
            }else{
                list.add(1);
            }
           n = n/2;
        }
        return list;
    }

    public static int convertToDecimal(List<Integer> binary){
        int count =0;
        long sum = 0;
        while (count < binary.size()){
            sum = (long) (sum + (Math.pow(2, count)* binary.get(count)));
            count++;
        }
        return  (int) (sum %( Math.pow(10, 9)+7));
    }

    public static <T> List<T> flattenListOfListsImperatively(
            List<List<T>> nestedList) {
        List<T> ls = new ArrayList<>();
        nestedList.forEach(ls::addAll);
        return ls;
    }
}
