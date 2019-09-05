package com.itheima;
import java.util.Scanner;
public class Day02Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的成绩：");
        int score = sc.nextInt();
        if (score >= 60){
            System.out.println("及格");

        }
        else {
            System.out.println("不及格");
        }

    }
}
