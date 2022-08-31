package recursion.google;

import java.util.ArrayList;

public class PhoneNumbCharCombination {

    public static void main(String[] args) {
        System.out.println(combinations("", "12"));
    }

   public static ArrayList<String> combinations(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> a= new ArrayList<>();
            a.add(p);
            return a;
        }
        ArrayList<String> list = new ArrayList<>();
        int n = up.charAt(0)-'0';
        for(int i=(n-1)*3; i< n*3; i++){
            char ch = (char)(i+'a');
           list.addAll(combinations(p+ ch, up.substring(1)));
        }
        return list;
   }
}
