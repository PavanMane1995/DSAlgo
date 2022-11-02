package recursion.google;

import java.util.ArrayList;

public class PhoneNumbCharCombination {

    public static void main(String[] args) {
        System.out.println(combinations("", "7"));
    }

   public static ArrayList<String> combinations(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> a= new ArrayList<>();
            a.add(p);
            return a;
        }
        ArrayList<String> list = new ArrayList<>();
        int n = up.charAt(0)-'0';
        int d = n*3;
        if(n == 7){
            d= n*3+1;
        }
        for(int i=(n-1)*3; i< d; i++){
            char ch = (char)(i+'a');
           list.addAll(combinations(p+ ch, up.substring(1)));
        }
        return list;
   }
}
