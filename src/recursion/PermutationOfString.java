package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class PermutationOfString {

    /**
     *  String input = "abc";
     *  String[] output = {"a", "b", "c", "ab", "ac", "bc", "abc"};
     */

    public static void main(String[] args) {
        subSets("", "abc");
        System.out.println(subSets1("", "abc"));
        System.out.println(subSetsAscii("", "abc"));
    }

    //Method 1
    static void subSets(String p, String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subSets(p+ch, up.substring(1));
        subSets(p, up.substring(1));

    }

    //Method 2
   static List<String> subSets1(String p, String up){
       List<String> left ;
       List<String> right;
        if(up.isEmpty()){

            List<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }

        char ch = up.charAt(0);
        left =subSets1(p+ch, up.substring(1));
        right = subSets1(p, up.substring(1));
        left.addAll(right);
        return left;


    }

    static List<String> subSetsAscii(String p, String up){
        List<String> first ;
        List<String> sec;
        List<String> third;
        if(up.isEmpty()){
            List<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }

        char ch = up.charAt(0);
        first =subSetsAscii(p+ch, up.substring(1));
        sec = subSetsAscii(p, up.substring(1));
        third = subSetsAscii(p+(ch+0), up.substring(1));

        first.addAll(sec);
        first.addAll(third);
        return first;
    }


}
