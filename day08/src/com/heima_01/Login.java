package com.heima_01;
import java.util.Scanner;

//已知用户名和密码，请用程序实现模拟用户登录。总共给三次机会，登录之后，给出相应的提示
/*
思路：
1:已知用户名和密码，定义两个字符串表示即可
2:键盘录入要登录的用户名和密码，用 Scanner 实现
3:拿键盘录入的用户名、密码和已知的用户名、密码进行比较，给出相应的提示。字符串的内容比较，用
equals() 方法实现
4:用循环实现多次机会，这里的次数明确，采用for循环实现，并在登录成功的时候，使用break结束循环
*/
public class Login {
    public static void main(String[] args) {
       String username ="xukang";
       String password ="xukang123";
       Scanner s = new Scanner(System.in);
        for (int i = 0; i <3 ; i++) {
            System.out.println("请输入用户名和密码登录");
            System.out.print("username:");
            String username1 = s.nextLine();
            System.out.print("password:");
            String password1 = s.nextLine();
            boolean result = username1.equals(username);
            boolean result1 = password1.equals(password);
            if (result == true&&result1==true){
                System.out.println("登录成功");
                break;
            }else {
                if (i==2){
                    System.out.println("登录失败");
                    System.out.println("您的机会已用完请与管理员联系");
                }else {
                    System.out.println("登录失败");
                    System.out.println("您还有"+(3-i-1)+"次机会");
                }

            }
        }

    }
}
