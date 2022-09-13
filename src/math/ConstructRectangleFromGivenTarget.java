package math;

import java.util.Arrays;

//https://leetcode.com/problems/construct-the-rectangle/
public class ConstructRectangleFromGivenTarget {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(rectangle(122122)));
    }

    public static int[] rectangle(int area){
        //as width is always less than or equal to length according to question
        int width = (int)Math.sqrt(area);
        while(area%width !=0){
            width--;
        }
        return new int[]{area/width, width};
    }

}
