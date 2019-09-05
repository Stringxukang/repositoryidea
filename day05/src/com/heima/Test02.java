package com.heima;

public class Test02 {
    public static void main(String[] args) {
        method();
    }
    public static void method(){
    int count = 0;//定义变量count，用于计算水仙花数的数量
        for (int i = 100; i <= 999; i++) {
        //计算出个位，十位，百位
        int ge = i % 10;
        int shi = i / 10 % 10;
        int bai = i / 100 % 10;
        if (i == (Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3))) {
            count += 1;
            System.out.println(i);

        }}
    }
}
