package com.itheima;
import java.util.Random;
public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();
        //用循环获取10个随机数
        for (int i = 0;i<=10;i++){
         //获取随机数
            int number =r.nextInt(10);
            System.out.println(number);
        }
    }
}
