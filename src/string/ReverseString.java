package string;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseWords("a good      example"));
    }

    public static String reverseWords(String s) {
        if(s == null){
            return s;
        }
        String res ="";
        String delim = "";

        String s1 = s.trim();
        for(String st : s1.split(" ")){

            if(!st.isEmpty()){
                String ss = st.trim();
                res = ss + delim+ res;
            }

            delim= " ";
        }
        return res;

    }
}
