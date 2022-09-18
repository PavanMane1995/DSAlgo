package recursion.string;

public class AlphabeticalContinuousStringMaxCount {
    public static void main(String[] args) {
        String s = "ababa";
        System.out.println(longestContinuousSubstring(s));
        System.out.println(longestContinuousSubstring2(s));
    }

    //Method 1
    public static int longestContinuousSubstring(String s) {
        //j is used as pointer to start count again from that character
        int j = 0, res = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(j) + i - j)
                j = i;
            res = Math.max(res, i - j + 1);
        }
        return res;
    }

    //method 2
    public static int longestContinuousSubstring2(String s) {
        int x=0, res=0, len=0;
        for(char ch : s.toCharArray()){
            len = ch-'a'-x == 1?len+1 : 1;
            res = Math.max(res, len);
            x=ch-'a';
        }
        return res;
    }
}
