package com.heima_04;

import java.util.Random;
import java.util.Scanner;

/*二,需求说明：实现用户注册、登陆功能；
1.	程序中使用一个长度为3的对象数组，存储用户的登录名和密码：
	例如如下格式：
		登录名    	密码
		zhangsan	1111
		lisi		2222
		wangwu		3333
	注册时，要判断数组是否已满，是：则禁止注册。

2.	循环为用户列出菜单：
	1.注册     2.登陆     3.退出

3.	用户选择1，调用：registe()方法，执行注册流程；
	用户选择2，调用：login()方法，执行登陆流程；
	用户选择3，结束程序；

4.	编写方法：registe()，执行注册流程：
		要求用户输入以下信息(信息无需校验)：
				用户名：
				登录密码：

5.	编写方法：login()，执行登陆流程：
		请用户输入登录名、登陆密码；
		使用登录名和密码进行验证；
			通过：打印：这个用户的所有信息；
			未通过：打印：用户名或密码错误！
* */
public class Test_02 {
    private static int index=0;
    private static Login[] u = new Login[3];

    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("菜单");
            System.out.println("1、注册");
            System.out.println("2、登录");
            System.out.println("3、退出");
            int i = sc.nextInt();
            switch (i) {
                case 1:
                    //System.out.println("注册");
                    registe();
                    break;
                case 2:
                   // System.out.println("登录");
                    login();
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
    private static void registe(){
        if (index>=u.length){
            System.out.println("用户已满，禁止注册");
            return;
        }
        System.out.println("请输入用户名：");
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine().trim();
        System.out.println("请输入登录密码：");
        String password = sc.nextLine().trim();
        Login u1 = new Login(username,password);
        u[index]=u1;
        System.out.println("注册成功");
        index++;

    }
    private static void login(){
        Scanner sc = new Scanner(System.in);
        Login u2 = new Login();
        System.out.println("请输入登录名和密码");
        System.out.println("username:");
        String username =sc.nextLine().trim();
        System.out.println("password:");
        String password = sc.nextLine().trim();
        for (int i = 0; i <u.length ; i++) {
            if (username.equals(u[i].getUsername())&&password.equals(u[i].getPassword())){
                System.out.println("登录成功");
                return;
            }
        }
            System.out.println("您输入的用户名或密码有误");

    }

}
