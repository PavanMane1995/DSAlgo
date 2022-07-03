package recursion;

public class RemoveCharFromStr {

    /*Ex. input -> String a = "abcdac"; //Remove 'a' from string;
          output -> String b = "bcdc";*/
    public static void main(String[] args) {
        String a = "abcdac";
        String b = "afbappleout";

        //calling method 1
        removeChar("", a);

        //calling method 2
        System.out.println(skip(a));

        //calling method 3 to skip entire string from string
        System.out.println(skipString(b));

    }

    //Method 1
    static void removeChar(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char c = up.charAt(0);
        if(c == 'a'){
            removeChar(p, up.substring(1));
        }else{
            removeChar(p+c, up.substring(1));
        }

    }

    //Method 2
    static String skip(String up){
        if(up.isEmpty()){
            return "";
        }

        char c = up.charAt(0);
        if(c == 'a'){
            return skip(up.substring(1));
        }else{
            return c + skip(up.substring(1));
        }

    }

    static String skipString(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return skipString(up.substring(5));
        }else{
            return up.charAt(0) + skipString(up.substring(1));
        }
    }

}
