package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//https://www.youtube.com/watch?v=wiGpQwVHdE0
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        String a = "abcabcdbbcdfrg";
        System.out.println(lengthOfLongestSubstring(a));
    }

    public static int lengthOfLongestSubstring(String s) {

        int c=0, i=0;
        HashSet<Character> set = new HashSet<>();
        int max =0;
        while(i < s.length()){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i++));
                max = Math.max(max, set.size());
            }else{
                set.remove(s.charAt(c++));
            }
        }

        set.forEach(System.out::print);

        return max;
    }
}
