package com.itheima;

public class MethodDemo_01 {
    public static void main(String[] args) {

        System.out.println(compare(10,10));
        System.out.println(compare((short) 10,(short) 10));
        System.out.println(compare((byte) 10,(byte)10));
        System.out.println(compare((long)10,(long)10));
    }
    //int
    public static boolean compare(int a,int b){
        System.out.println("int");
        return a == b;
    }
    //short
    public static boolean compare(short a,short b){
        System.out.println("short");
        return a == b;
    }
    //byte
    public static boolean compare(byte a,byte b){
        System.out.println("byte");
        return a == b;
    }
    //long
    public static boolean compare(long a,long b){
        System.out.println("long");
        return a == b;
    }
}
