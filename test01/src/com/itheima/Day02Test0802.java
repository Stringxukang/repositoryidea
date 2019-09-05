package com.itheima;
import java.util.Scanner;
public class Day02Test0802 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入X的值:");
        int x = sc.nextInt();

        if (x>=3){
            int y =2*x+1;
            System.out.println(y);
        }
        else if (x>=-1 & x <3){
            int y =2*x;
            System.out.println(y);
        }
        else{
            int y =2*x - 1;
            System.out.println(y);
        }

    }
}
