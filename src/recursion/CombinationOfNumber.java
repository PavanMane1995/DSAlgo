package recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationOfNumber {
    public static void main(String[] args) {

        int n=4, k=2;
        List<List<Integer>> res = new ArrayList<>();
        combination(new ArrayList<Integer>(), n, k, res);
        System.out.println(res);
    }

    public static void combination(List<Integer> p, int up, int k, List<List<Integer>> res){
        if(p.size() == k){
            List<Integer> in = new ArrayList<>(p);
            //in.addAll(p);
            res.add(in);
            return;
        }

        for(int i=up; i>0; i--){
          /*  if(p.contains(i))
                continue;*/
            p.add(0, i);
            combination(p,i-1 ,k,res);
            p.remove(0);
        }
        //up = up-1;
    }
}
