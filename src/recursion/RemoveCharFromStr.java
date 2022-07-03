package recursion;

public class RemoveCharFromStr {

    /*Ex. input -> String a = "abcdac"; //Remove 'a' from string;
          output -> String b = "bcdc";*/
    public static void main(String[] args) {
        String a = "abcdac";

        //calling method 1
        //removeChar("", a);

        //calling method 2
        System.out.println(skip(a));

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

}
