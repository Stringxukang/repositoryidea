package 徐康;

import java.util.Scanner;

//键盘录入两个整数,使用if语句求出他们的最大值,并打印在控制台上.
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int number2 = sc.nextInt();
        int max = number1;
        if (number1 > number2) {
            max = number1;
        } else {
            max = number2;
        }
        System.out.println("最大数为：" + max);
    }
}
