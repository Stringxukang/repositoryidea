package com.heima_02;

import java.util.Scanner;

public class uesrLogin {
    public static void main(String[] args) {
        String username = "xukang";
        String password = "123456";
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String s1 = sc.nextLine();
            System.out.println("请输入密码：");
            String s2 = sc.nextLine();
            if (username.equals(s1) == true && password.equals(s2) == true) {
                System.out.println("登录成功");
                break;
            } else {
                System.out.println("您还有" + (2 - i) + "次机会，请重新输入");
            }
        }
    }
}
