package recursion.maze;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(countWays(2,2));
        System.out.println(findWays("", 3,3));
        System.out.println(findWaysDiagonally("", 3,3));
    }

    //Count ways to end of maze from starting n,n to 1,1
    public static int countWays(int l, int r){
        if(l==1 || r==1){
            return 1;
        }

        int count =0;
        count = count + countWays(l-1, r);
        count = count + countWays(l, r-1);
        return count;
    }

    //find ways you can move either right or down
    public static ArrayList<String> findWays(String w, int d, int r){
        if(d==1 && r==1){
            ArrayList<String> l = new ArrayList<>();
            l.add(w);
            return l;
        }
        ArrayList<String> left = new ArrayList<>();
        ArrayList<String> right = new ArrayList<>();

        if(d>1)
            left.addAll(findWays(w+"D", d-1, r));
        if(r>1)
            right.addAll(findWays(w+"R", d, r-1));
        left.addAll(right);

        return left;

    }

    //find ways you can move either right, down and also diagonally
    public static ArrayList<String> findWaysDiagonally(String w, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> l = new ArrayList<>();
            l.add(w);
            return l;
        }
        ArrayList<String> left = new ArrayList<>();
        ArrayList<String> right = new ArrayList<>();
        ArrayList<String> diag = new ArrayList<>();

        if(r>1)
            left.addAll(findWaysDiagonally(w+"D", r-1, c));
        if(c>1)
            right.addAll(findWaysDiagonally(w+"R", r, c-1));
        if(r>1 && c>1)
            diag.addAll(findWaysDiagonally(w+"P", r-1, c-1));
        left.addAll(right);
        left.addAll(diag);

        return left;

    }


}
