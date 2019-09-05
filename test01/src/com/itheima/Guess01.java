package com.itheima;

import java.util.Random;
import java.util.Scanner;

//0==石头 1==剪刀 2==布
public class Guess01 {
    public static void main(String[] args) {

        Random r = new Random();
        int computer =r.nextInt(3);
        System.out.println("请输入0==石头 1==剪刀 2==布：");
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();

        if (user == computer){
            System.out.println("平局");
        }else if((user==0&&computer==1)||(user==1&&computer==2)||(user==2&&computer==0)){
            System.out.println("你赢了");
        }else{
            System.out.println("你输了");
        }
        System.out.println("user:"+ user +" "+ "computer:" +computer);
    }
}
