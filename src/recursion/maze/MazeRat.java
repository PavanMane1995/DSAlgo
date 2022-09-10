package recursion.maze;

import java.util.ArrayList;

public class MazeRat {

    public static void main(String[] args) {
        int m[][] = {{1, 0},
                {1, 0}};

        System.out.println(findPath(m, 4));
    }
        public static ArrayList<String> findPath(int[][] m, int n) {
            // Your code here
            return find("", m, 0, 0);


        }

        public static ArrayList<String> find(String P, int[][] maze, int r, int c){
            if(maze.length-1 == r && maze[0].length-1 == c){
                ArrayList<String> l = new ArrayList<>();
                l.add(P);
                return l;
            }

            if(maze[r][c] ==0){
                return new ArrayList<String>();
            }

            maze[r][c] =0;

            ArrayList<String> list = new ArrayList<>();
            if(r < maze.length-1){
                list.addAll(find(P+"D", maze, r+1,c));
            }
            if(c < maze[0].length-1){
                list.addAll(find(P+"R", maze, r,c+1));
            }
            if(r > 0){
                list.addAll(find(P+"U", maze, r-1, c));
            }
            if(c > 0){
                list.addAll(find(P+"L", maze, r, c-1));
            }
            maze[r][c] =1;
            return list;
        }

}
