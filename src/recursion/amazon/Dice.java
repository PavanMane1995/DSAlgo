package recursion.amazon;

import java.util.ArrayList;

public class Dice {

    public static void main(String[] args) {
        System.out.println(combinations("", 4));
    }

    public static ArrayList<String> combinations(String t, Integer n){

        if(n == 0){
            ArrayList<String> l = new ArrayList<>();
            l.add(t);
            return l;
        }
        ArrayList<String> list = new ArrayList<>();

        for (int i=1; i<=6 && i<=n; i++){
            list.addAll(combinations(t+i, n-i));
        }
        return list;
    }

}
