package com.heima01;

import java.util.Arrays;

public class Cope {
    public static void main(String[] args) {
        int[] arr = {23,24,12};
        int[] arr1 = Arrays.copyOfRange(arr,1,5);
        for (int i = 0; i <arr1.length ; i++) {
            System.out.println(arr1[i]);
        }

    }
}
