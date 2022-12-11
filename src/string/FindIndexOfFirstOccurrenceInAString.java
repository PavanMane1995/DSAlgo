package string;

import java.util.ArrayList;
import java.util.List;

public class FindIndexOfFirstOccurrenceInAString {
    public static void main(String[] args) {
        String s = "mississippi";
        String f = "issip";
        System.out.println(strStr(s,f));

    }

    public static int strStr(String haystack, String needle) {

        int c = 0;
        int n = needle.length() - 1;

        for (int i = 0; i < haystack.length() - n; i++) {
            boolean flag = true;
            for (int j = 0; j <= n; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return i;
            }
        }
        return  -1;
    }
}
