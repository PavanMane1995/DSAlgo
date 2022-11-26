package string;

import java.util.*;

public class CountOccurencesofAnagrams {

    public static void main(String[] args) {

        System.out.println(search("abc", "cbaebabacd"));
        System.out.println(search2("abc", "cbaebabacd"));
        System.out.println(search3("abc", "cbaebabacd"));
    }

    static int search(String pat, String txt) {
        int count =0;
        //initial validation
        if(pat.length() > txt.length() || pat.length() ==0){
            return count;
        }
        int[] patCountArr = new int[26];
        //Taking count of each alphabet
        for(char p : pat.toCharArray()){
            patCountArr[p-'a']++;
        }
        char[] txtCharArray = txt.toCharArray();
        for(int i=0; i<= txtCharArray.length-pat.length(); i++){
            int[] temp = Arrays.copyOfRange(patCountArr, 0, patCountArr.length);
            int k = pat.length()+i; // iterating pat.length times
            int j=i;
            int reverseCount = pat.length();
            while(j<k && j < txt.length()){
                int a = temp[txtCharArray[j]-'a']--;
                if(temp[txtCharArray[j]-'a'] >= 0){
                    reverseCount = reverseCount - (a - temp[txtCharArray[j]-'a']);
                }

                j++;
            }
            if(reverseCount ==0){
                count = count+1;
            }
        }
        return count;
    }


    static ArrayList<Integer> search2(String p, String s) {
       // int count =0;
        ArrayList<Integer> list = new ArrayList<>();
        //initial validation
        if(p.length() > s.length() || p.length() ==0){
            return list;
        }
        int[] patCountArr = new int[26];
        //Taking count of each alphabet
        for(char ch : p.toCharArray()){
            patCountArr[ch-'a']++;
        }
        char[] txtCharArray = s.toCharArray();
        for(int i=0; i< txtCharArray.length && i<= txtCharArray.length-p.length(); i++){
            int[] temp = Arrays.copyOfRange(patCountArr, 0, patCountArr.length);
            int k = p.length()+i; // iterating pat.length times
            int j=i;
            int reverseCount = p.length();
            while(j<k && j < s.length()){
                int a = temp[txtCharArray[j]-'a']--;
                if(temp[txtCharArray[j]-'a'] >= 0){
                    reverseCount = reverseCount - (a - temp[txtCharArray[j]-'a']);
                }

                j++;
            }
            if(reverseCount ==0){
               list.add(i);
            }
        }
        return list;
    }


    ///Method 3
    static List<Integer> search3(String t, String s){
        List<Integer> result = new LinkedList<>();
        if(t.length()> s.length()) return result;
        Map<Character, Integer> map = new HashMap<>();
        for(char c : t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int counter = map.size();

        int begin = 0, end = 0;
        int head = 0;
        int len = Integer.MAX_VALUE;


        while(end < s.length()){
            char c = s.charAt(end);
            if( map.containsKey(c) ){
                map.put(c, map.get(c)-1);
                if(map.get(c) == 0) counter--;
            }
            end++;

            while(counter == 0){
                char tempc = s.charAt(begin);
                if(map.containsKey(tempc)){
                    map.put(tempc, map.get(tempc) + 1);
                    if(map.get(tempc) > 0){
                        counter++;
                    }
                }
                if(end-begin == t.length()){
                    result.add(begin);
                }
                begin++;
            }

        }
        return result;
    }

}
