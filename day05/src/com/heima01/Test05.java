package com.heima01;

import java.util.Scanner;

/*
 * 有定义一个方法,可以接受一个整型的分数,
	如果分数为[90,100]这个范围方法返回’A’
	如果分数为[80,90)这个范围方法返回’B’
	如果分数为[70,80)这个范围方法返回’C’
	如果分数为[60,70)这个范围方法返回’D’
	如果分数为[0,60)这个范围方法返回’E’
	分数不在以上范围的返回’F’
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整型的分数：");
        int score =sc.nextInt();
        System.out.println("得分为："+grade(score));
    }
    public static char grade(int number){
        //char get = 'A';
        if (number>=90&&number<=100){
            return 'A';
        }else if (number>=80&&number<90){
            return 'B';
        }else if (number>=70&&number<80){
            return 'C';
        }else if (number>=60&&number<70){
            return 'D';
        }else if (number>=0&&number<60){
            return 'E';
        }else {
            return 'F';
        }
    }
}
