package com.itheima;
import java.util.Scanner;
public class Week {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入1-7的数字：");
                int day = sc.nextInt();
        if (day == 1){
            System.out.println("今天星期一");
        }
        else if (day == 2){
            System.out.println("今天星期二");
        }
        else if (day == 3){
            System.out.println("今天星期三");
        }
        else if (day == 4){
            System.out.println("今天星期四");
        }
        else if (day == 5){
            System.out.println("今天星期五");
        }
        else if (day == 6){
            System.out.println("今天星期六");
        }
        else {
            System.out.println("今天星期天");
        }
    }
}
