package recursion.maze;

import java.util.ArrayList;

public class MazeWithObstacleStartZero {
    public static void main(String[] args) {
        System.out.println(maze("", 0,0, 2));
    }

    public static ArrayList<String> maze(String p, int r, int c, int s){

        if(r==s && c==s){
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(p);
            return arrayList;
        }
        //Obstacle at cell 1,1
        if(r==1 && c==1){
            return new ArrayList<>();
        }
        ArrayList<String> l1 = new ArrayList<>();
        ArrayList<String> l2 = new ArrayList<>();

        if (r < s+1) {
            l1.addAll(maze(p+"R", r+1, c, s));
        }
        if (c < s+1) {
            l2.addAll(maze(p+"D", r, c+1, s));
        }

        l1.addAll(l2);
        return l1;

    }


}
