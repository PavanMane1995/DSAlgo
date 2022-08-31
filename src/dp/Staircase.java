package dp;

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * Input: n = 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 */
public class Staircase {
    public static void main(String[] args) {
        int n=5;
        System.out.println(num_ways2(n));
    }

    //Method 1
    public static int num_ways(int n){
        if(n < 2){
            return 1;
        }
        int[] nums = new int[n+1];
        nums[0] = 1; nums[1] = 1;

        for(int i=2; i<= n; i++){
            nums[i] = nums[i-2] + nums[i-1];
        }
        return nums[n];
    }

    //Method 2 fastest
    public static int num_ways2(int n){
        if(n < 2){
            return 1;
        }
        int first = 1, sec = 1;
        int all_ways = 2;
        for (int i=2; i<=n; i++){
            all_ways = first + sec;
            first = sec;
            sec = all_ways;
        }
        return all_ways;
    }
}
