package recursion.maze;

import java.util.ArrayList;

public class MazeWithBackTracking {

    public static void main(String[] args) {
        boolean[][] arr = {{true, true, true},
                {true, true, true},
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
        maze[r][c] = false;
        ArrayList<String> list = new ArrayList<>();

        if (r < maze.length-1) {
            list.addAll(maze(p+"D",maze, r+1, c));
        }
        if (c < maze[0].length-1) {
            list.addAll(maze(p+"R",maze, r, c+1));
        }
        if (r > 0) {
            list.addAll(maze(p+"U", maze,r-1, c));
        }
        if (c >0) {
            list.addAll(maze(p+"L", maze,r, c-1));
        }
        maze[r][c] =true;
        return list;
    }
}
