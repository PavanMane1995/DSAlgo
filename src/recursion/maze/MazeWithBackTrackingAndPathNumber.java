package recursion.maze;

import java.util.ArrayList;
import java.util.Arrays;

public class MazeWithBackTrackingAndPathNumber {
    public static void main(String[] args) {
        boolean[][] arr = {{true, true, true},
                {true, true, true},
                {true, true, true}};
        int[][] arr2 = new int[arr.length][arr[0].length];
        maze("", arr, 0, 0, arr2, 1);
    }

    public static ArrayList<String> maze(String p, boolean[][] maze, int r, int c, int[][] path, int step){
        if(r == maze.length-1 && c == maze[0].length-1){
            //Added Last step
            path[r][c] = step;
            ArrayList<String> al = new ArrayList<>();
            al.add(p);
            for (int[] arr: path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();

            return al;
        }
        //obstacle
        if(!maze[r][c]){
            return new ArrayList<>();
        }
        path[r][c] = step;
        maze[r][c] = false;
        ArrayList<String> list = new ArrayList<>();

        if (r < maze.length-1) {
            list.addAll(maze(p+"D",maze, r+1, c, path, step+1));
        }
        if (c < maze[0].length-1) {
            list.addAll(maze(p+"R",maze, r, c+1, path, step+1));
        }
        if (r > 0) {
            list.addAll(maze(p+"U", maze,r-1, c, path, step+1));
        }
        if (c >0) {
            list.addAll(maze(p+"L", maze,r, c-1, path, step+1));
        }
        maze[r][c] =true;
        path[r][c] =0;
        return list;
    }
}
