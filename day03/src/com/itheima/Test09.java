package com.itheima;

public class Test09 {
    public static void main(String[] args) {
        double thickness = 0.1;//定义一个变量为纸张的厚度
        int i = 0;
        while (thickness <= 8844430){

            thickness*=2;
            i++;
        }
        System.out.println("需要折叠的次数为"+ i +"次");
    }
}
