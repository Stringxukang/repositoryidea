package com.itheima;

public class Test06 {
    public static void main(String[] args) {


        int i = 100;
        while (i < 1000) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            if (i == (Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3))) {

                System.out.println(i);


            }
            i++;


        }
    }
}
