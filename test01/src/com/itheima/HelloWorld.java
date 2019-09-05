
package com.itheima;
import java.util.Scanner;

public class HelloWorld {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个和尚的身高：");
        int height1 = sc.nextInt();
        System.out.println("请输入第二个和尚的身高：");
        int height2 = sc.nextInt();
        System.out.println("请输入第三个和尚的身高：");
        int height3 = sc.nextInt();
        int i = height1 > height2?height1:height2;
        //i +=20;
        int max = i > height3?i:height3;

        System.out.println("最高和尚的身高：" + max);

    }
}
