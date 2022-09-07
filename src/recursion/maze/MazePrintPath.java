package recursion.maze;

import java.util.ArrayList;
import java.util.List;

public class MazePrintPath {
    public static void main(String[] args) {
       // printPath("", 3, 3);
        System.out.println(printPathRet("", 3, 3));
    }

    //Method 1 : Print in method itself
    public static void printPath(String a, int r, int c){
        if(r==1 && c==1){
            System.out.println(a);
            return;
        }
        if(r >1){
            printPath(a+"D", r-1, c);
        }
        if(c>1){
            printPath(a+"R", r, c-1);
        }
    }

    //Method 2 : Return List
    public static ArrayList<String> printPathRet(String a, int r, int c){
        ArrayList<String> right = new ArrayList<>();
        ArrayList<String> left = new ArrayList<>();
        if(r==1 && c==1){
            ArrayList<String> l = new ArrayList<>();
            l.add(a);
            return l;
        }

        if(r >1){
           left.addAll(printPathRet(a + "D", r - 1, c));
        }
        if(c>1){
            right.addAll(printPathRet(a+"R", r, c-1));
        }
        left.addAll(right);
        return left;

    }
}
