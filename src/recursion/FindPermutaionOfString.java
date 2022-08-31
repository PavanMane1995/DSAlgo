package recursion;

import java.util.ArrayList;

public class FindPermutaionOfString {

    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "eidbaooo"));
    }
    public static boolean checkInclusion(String s1, String s2) {
        ArrayList<String> l = permutations("", s1);
        for(String s : l){
            if(s2.contains(s)){
                return true;
            }
        }
        return false;
    }

    public static ArrayList<String> permutations(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<=p.length(); i++){
            char ch = up.charAt(0);
            list.addAll(permutations(p.substring(0,i)+ch+p.substring(i, p.length()), up.substring(1)));
        }
        return list;

    }
}
