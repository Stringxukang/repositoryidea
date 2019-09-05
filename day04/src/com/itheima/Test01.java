package com.itheima;

public class Test01 {
    public static void main(String[] args) {
        String[] arr ={"B哥","徐康","孙文龙"};
        System.out.print("[");
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println("]");
    }
}
