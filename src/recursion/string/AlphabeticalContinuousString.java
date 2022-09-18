package recursion.string;


import java.util.HashSet;
import java.util.Set;

/* An alphabetical continuous string is a string consisting of consecutive letters in the alphabet.
In other words, it is any substring of the string "abcdefghijklmnopqrstuvwxyz" */
public class AlphabeticalContinuousString {

    public static void main(String[] args) {
        String s = "abacaba";
        Set<String>  set = findContiguousAlphabets("", s);
        //Printing combinations
        System.out.println(set);

        //printing max String count.
        System.out.println(set.stream().max((str1, str2) -> {
            if(str1.length()==str2.length()){
                return 0;
            }else if(str1.length() > str2.length()){
                return 1;
            }
                return -1;
        }
        ).get().length());
    }

    public static Set<String> findContiguousAlphabets(String p, String up){

        if(up.isEmpty() || !p.isEmpty() && p.charAt(p.length()-1)+1 != up.charAt(0)){
            Set<String> inner = new HashSet<>();
            inner.add(p);
            return inner;
        }

        Set<String> left = findContiguousAlphabets(p + up.charAt(0), up.substring(1));
        Set<String> right = findContiguousAlphabets(p, up.substring(1));
        left.addAll(right);
        return left;
    }

}
