package com.heima_01;

public class StringBuilderDemo {
    public static void main(String[] args) {
        ////public StringBuilder()：创建一个空白可变字符串对象，不含有任何内容
        StringBuilder s1 = new StringBuilder();
        System.out.println("s1:" + s1);
        System.out.println("s1.length:" + s1.length());
        StringBuilder s2 = new StringBuilder("hello");
        System.out.println("s2:" + s2);
        System.out.println("s2.length:" + s2.length());
    }
}
