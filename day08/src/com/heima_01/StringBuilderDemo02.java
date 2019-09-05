package com.heima_01;

public class StringBuilderDemo02 {
    public static void main(String[] args) {
            //StringBuilder 转换为 String
        StringBuilder st = new StringBuilder();
        st.append("abc");
        String s =st.toString();
        System.out.println(s);
        System.out.println(s.indexOf('b'));
//String类转换为StringBuilder
        String s1 ="hello";
        StringBuilder s2 =new StringBuilder(s1);
        System.out.println(s2.reverse());
    }
}
