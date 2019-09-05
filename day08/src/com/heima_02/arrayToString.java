package com.heima_02;

import java.util.Arrays;

public class arrayToString {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(arr));
        String s1 =Arrays.toString(arr);
        StringBuilder s2 = new StringBuilder(s1);
        System.out.println(s2.reverse());



//        System.out.println(ToString(arr));
    }

    /*public static String ToString(int[] arr) {
        String s = "";
        s += "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == (arr.length - 1)) {
                s += arr[i];
            } else {
                s += arr[i];
                s = s + ",";
            }
        }
        s += "]";
        return s;
    }*/
}
