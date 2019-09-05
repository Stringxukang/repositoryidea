package com.heima;

public class Test08 {
    public static void main(String[] args) {
        System.out.println(compare(10L,10L));
    }
    public static boolean compare(int a,int b){
        System.out.println("int");
        return a==b;

    }
    public static boolean compare(long a,long b){
        System.out.println("long");
        return a==b;
    }
}
