package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermutationOfNumber {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        permutation(new ArrayList<>(), list);

    }

    public static void permutation(List<Integer> p, List<Integer> up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        for (int i=0; i< up.size(); i++){
            List<Integer> current = up;
            p.add(up.get(i));
            current.remove(i);
            permutation(p, current);
        }
    }
}
