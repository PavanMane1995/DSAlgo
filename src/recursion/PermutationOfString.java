package recursion;

import java.util.ArrayList;

public class PermutationOfString {

    /**
     * input = "abc"
     * output = [abc, acb, bac, bca, cab, cba]
     * @param args
     */
    public static void main(String[] args) {
      /*  System.out.println("Print inside method");
        permutation("", "abc");
        System.out.println("\nReturn Permutaion List");
        ArrayList<String> ans = permutationList("", "abcd");
        ans.forEach(System.out::println);*/
        System.out.println(percentageLetter("foobar", 'b'));
    }

    static void permutation(String p, String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0; i<=p.length(); i++){
            permutation(p.substring(0,i)+ch+p.substring(i,p.length()), up.substring(1));
        }
    }

    //Method 2
    static ArrayList<String> permutationList(String p, String up){

        if(up.isEmpty()){
           ArrayList<String> a = new ArrayList<>();
           a.add(p);
            return a;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0; i<=p.length(); i++){
            ans.addAll(permutationList(p.substring(0,i)+ch+p.substring(i,p.length()), up.substring(1)));
        }
        return ans;
    }


    public static int percentageLetter(String s, char letter) {
        char[] ch = s.toCharArray();
        double count = 0.0;
        for(char c : ch){
            if(c == letter){
                count = count+1;
            }
        }
        double a = count/s.length();
        return (int)(a * 100);
    }

}
