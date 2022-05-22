package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(repeatedString("aba", 10));

    }

    public static long repeatedString(String s, long n) {
        // Write your code here
        long count = 0;
        char[] list =s.toCharArray();
        if (list.length < 1) {
            return count;
        }


        for (char c : list) {
            if(c== 'a'){
                count++;
            }
        }
       long noOfRepetations = n/s.length();
        count = count * noOfRepetations;
        long lastLeftOvers = n%s.length();
        for(int i=0; i<lastLeftOvers;i++){
            if(list[i] == 'a')
                count++;
        }

        return count;

    }

}
