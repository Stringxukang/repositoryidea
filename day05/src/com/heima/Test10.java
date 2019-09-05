package com.heima;

public class Test10 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4 };
        int max=getMax(arr);
        System.out.println("max:"+max);
    }
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>max){
                max =arr[i];
            }
        }
        return max;
    }
}
