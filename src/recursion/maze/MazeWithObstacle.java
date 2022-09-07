package recursion.maze;

import java.util.ArrayList;

public class MazeWithObstacle {

    public static void main(String[] args) {
        System.out.println(maze(4,4));
        System.out.println(mazePath("", 4,4));
    }

    public static int maze(int r, int c){
        if(r==1 || c==1){
            return 1;
        }
        if(r==2 && c==2){
            return 0;
        }
        int count =0;
        count =count + maze(r-1, c);
        count =count + maze(r, c-1);

        return count;
    }

    public static ArrayList<String> mazePath(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> a = new ArrayList<>();
            a.add(p);
            return a;
        }
        if(r==2 && c==2){
            return new ArrayList<>();
        }
        ArrayList<String> l = new ArrayList<>();
        ArrayList<String> l1 = new ArrayList<>();
        if(r>1)
            l.addAll(mazePath(p+ "D",r-1, c));
        if(c>1)
            l1.addAll(mazePath(p+"R", r, c-1));
        l.addAll(l1);
        return l;

    }
}
