package math;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RomanToIntegersConversion {

    public static void main(String[] args) {
        Map<Character, Integer> map=new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put( 'D',500);
        map.put( 'M', 1000);
        System.out.println(convertToInt("MCMXCVIII", map));


    }

    public static int convertToInt(String r, Map<Character, Integer> map){
        int value = 0;
        for (int i = 0; i < r.length()-1; i++) {
            if(map.get(r.charAt(i)) < map.get(r.charAt(i+1))){
                value = value - map.get(r.charAt(i));
            }else{
                value = value + map.get(r.charAt(i));
            }
        }
        return value += map.get(r.charAt(r.length()-1));
    }
}
