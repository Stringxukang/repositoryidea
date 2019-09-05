package com.itheima;
import java.util.Scanner;
public class Day02Test07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int b = sc.nextInt();
        System.out.println("请输入您要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算):");
        int c = sc.nextInt();


        if (c ==0){
            System.out.println(a +"+" +b +"="+(a+b));
        }
        if (c ==1){
            System.out.println(a +"-" +b +"="+(a-b));
        }
        if (c ==2){
            System.out.println(a +"*" +b +"="+(a*b));
        }
        if (c ==3){
            System.out.println(a +"/" +b +"="+(a/b));
        }
    }
}