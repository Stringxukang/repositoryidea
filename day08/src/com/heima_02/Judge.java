package com.heima_02;

public class Judge {
    public static void main(String[] args) {
        //定义要匹配E-mial地址的正则表达式
        String regex ="\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3})";
        String str1 ="aaa@";//定义要进行验证的字符串
        String str2 ="aaaaaa";
        String str3 ="1111@111ffyu.dfg.com";
        if (str1.matches(regex)){
            System.out.println(str1+"是一个合法的E-mail地址格式");
        }

    }
}
