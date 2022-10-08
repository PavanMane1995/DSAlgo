package dp;

//https://leetcode.com/problems/minimum-time-to-make-rope-colorful/
public class MinimumTimetoMakeRopeColorful {

    public static void main(String[] args) {
        System.out.println(minCost("bbbaaa", new int[]{4,9,3,8,8,9}));
    }

    public static int minCost(String colors, int[] neededTime) {
        char[] col = colors.toCharArray();
        int colIndex =  col.length;
        int i =0, j=1;
        if(colIndex == 2 && col[i] == col[j])
            return Math.min(neededTime[i], neededTime[j]);
        int sum=0;

        while(j < colIndex){
            //int s =0;

            if(col[i] == col[j]){
                sum = sum + Math.min(neededTime[i], neededTime[j]);
                if(neededTime[i] <=neededTime[j]){
                    i=j;
                }

            }else{
                i = j;
            }
            j++;

        }
        return sum;
    }
}
