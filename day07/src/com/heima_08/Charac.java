package com.heima_08;

public class Charac {
    public static void main(String[] args) {
        String str = Integer.toString(456);
        System.out.println("十进制"+str);
        String str2 = Integer.toBinaryString(456);
        System.out.println("二进制："+str2);
        String str3 = Integer.toOctalString(456);
        System.out.println(str3);
        Boolean bool = new Boolean("ok");
        System.out.println(bool);
        System.out.println(bool.booleanValue());
    }
}
