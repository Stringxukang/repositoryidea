package com.heima;

public class Test09 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        arrList(arr1);
    }
    public static void arrList(int[] arr){
        System.out.print("[");
        for (int i = 0; i <arr.length ; i++) {
            if (i==arr.length-1){
                System.out.print(arr[i]+"]");
            }else {
                System.out.print(arr[i]+", ");
            }

        }
    }
}
