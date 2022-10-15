package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermutationOfNumber {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(3);
       permutation(new ArrayList<>(), list, 0);
        //System.out.println(Integer.MAX_VALUE);
    }

    public static void permutation(List<Integer> p, List<Integer> up, int j){
        if(up.size() == p.size()){
            System.out.println(p);
            return;
        }

        for (int i=j; i< up.size(); i++){
           /* if(p.contains(up.get(i))){
                continue;
            }*/
            p.add(up.get(i));
            permutation(p, up, j+1);
            p.remove(p.size()-1);

        }
    }
}

