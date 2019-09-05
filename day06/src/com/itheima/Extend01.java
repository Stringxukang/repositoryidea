package com.itheima;
//1-1000内不能被7整除并且不包括7的三位数，并统计个数
public class Extend01 {
    public static void main(String[] args) {
        int count = 0;
        for (int x = 100; x <1000; x++) {
//            要么个位是7，要么十位是7，要么能够被7整除
            if (x % 10 == 7 || x / 10 % 10 == 7||x/100%10==7 || x % 7 == 0) {

            }else{
                System.out.println(x);
                count++;
            }
        }
        System.out.println("count:"+count);
    }
}
