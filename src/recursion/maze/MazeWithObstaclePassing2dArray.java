package recursion.maze;

import java.util.ArrayList;

public class MazeWithObstaclePassing2dArray {

    public static void main(String[] args) {
        boolean[][] arr = {{true, true, true},
                          {true, false, true},
                            {true, true, true}};
        System.out.println(maze("", arr, 0, 0));
    }

    public static ArrayList<String> maze(String p, boolean[][] maze, int r, int c){
        if(r == maze.length-1 && c == maze[0].length-1){
            ArrayList<String> al = new ArrayList<>();
            al.add(p);
            return al;
        }
        //obstacle
        if(!maze[r][c]){
            return new ArrayList<>();
        }

        ArrayList<String> l1 = new ArrayList<>();
        //ArrayList<String> l2 = new ArrayList<>();

        if (r < maze.length-1) {
            l1.addAll(maze(p+"D",maze, r+1, c));
        }
        if (c < maze[0].length-1) {
            l1.addAll(maze(p+"R",maze, r, c+1));
        }

       // l1.addAll(l2);
        return l1;
    }
}
