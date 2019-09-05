package com.homework;

import java.util.Scanner;

/*
从键盘上输入10个整数，合法值为1、2或3，不是这3个数则为非法数字。试编程统计每个整数和非法数字的个数。
分析：
	1.创建键盘录入对象
	2.定义长度为10的int类型的数组
	3.定义int类型的变量count1（统计1的个数）、count2（统计2的个数）、count3（统计3的个数）、count4（统计非法数字的个数）
	4.利用for循环给数组元素赋值
	5.利用for循环遍历数组
		(1)获取当前元素
		(2)使用if进行判断
			a.如果等于1 count1++
			b.否则，如果等于2 count2++
			c.否则，如果等于3 count3++
			d.否则 count4++

	6.打印统计结果

 */
public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int count1 = 0;//统计1的个数
        int count2 = 0;//统计2的个数
        int count3 = 0;//统计3的个数
        int count4 = 0;//统计4的个数
        for (int i = 0; i <10 ; i++) {
            System.out.println("请输入第"+(i+1) +"个整数：");
            int number = sc.nextInt();
            arr[i] = number;
            if (number ==1){
                count1++;
            }else if (number == 2){
                count2++;
            }else if (number ==3){
                count3++;
            }else {
                count4++;
            }
        }
        System.out.println("1的个数为：" + count1);
        System.out.println("2的个数为：" + count2);
        System.out.println("3的个数为：" + count3);
        System.out.println("非法数字的个数为：" + count4);
    }
}
