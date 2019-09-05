package com.itheima;

public class WhileTest01 {
    //初始化语句
    public static void main(String[] args) {
       /*
       while循环
        */
        int i =1;
        while(i<=5){
            //循环体语句
            System.out.println(i);

            //条件控制语句
            i++;
        }
        System.out.println("---------");
        //for循环
        for (int j=1;j<=5;j++){
            System.out.println(j);
        }
    }

}
