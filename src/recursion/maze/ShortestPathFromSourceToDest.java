package recursion.maze;

import java.util.ArrayList;

public class ShortestPathFromSourceToDest {

    public static void main(String[] args) {
        int m[][] = {{1, 1, 1},
                     {1, 1, 1},
                     {1, 1, 1}};
        int[] d ={2,2};

        System.out.println(find(0, m, 0, 1,d ));
    }

    public static int find(int P, int[][] maze,int r, int c, int[] d){
        if(d[0] == r && d[1] == c){
           return P;
        }

        if(maze[r][c] ==0){
            return 0;
        }
        maze[r][c] =0;
        int minPathCount =0;
        if(r < maze.length-1){
            int current = find(P+1, maze, r+1,c,d);
            if(current !=0 && minPathCount !=0)
                minPathCount = Math.min(minPathCount, current);
            else if(minPathCount ==0)
                minPathCount = current;
        }
        if(c < maze[0].length-1){
            int current =find(P+1, maze, r,c+1,d);
            if(current !=0 && minPathCount !=0)
                minPathCount = Math.min(minPathCount, current);
            else if(minPathCount ==0)
                minPathCount = current;
        }
        if(r > 0){
            int current =find(P+1, maze, r-1, c,d);
            if(current !=0 && minPathCount !=0)
                minPathCount = Math.min(minPathCount, current);
            else if(minPathCount ==0)
                minPathCount = current;
        }
        if(c > 0){
            int current =find(P+1, maze, r, c-1,d);
            if(current !=0 && minPathCount !=0)
                minPathCount = Math.min(minPathCount, current);
            else if(minPathCount ==0)
                minPathCount = current;
        }
        maze[r][c] =1;
        return minPathCount;
    }

}
