package com.homework;
/*
	 * 有这么一个数组：int[] arr1 = {3,4,5,6,7};
	还有这么一个数组：String[] arr2 = {"方块", "梅花", "红桃", "黑桃"};
	根据这两个数组，打印出能够组合的扑克牌，像下面那样打印：

	方块3 梅花3 红桃3 黑桃3
	方块4 梅花4 红桃4 黑桃4
	方块5 梅花5 红桃5 黑桃5
	方块6 梅花6 红桃6 黑桃6
	方块7 梅花7 红桃7 黑桃7
	 */
public class Test06 {
    public static void main(String[] args) {
        int[] arr1 = {3,4,5,6,7};
        String[] arr2 = {"方块", "梅花", "红桃", "黑桃"};
        for (int i = 0; i <arr2.length ; i++) {
            for (int j = 0; j <arr1.length ; j++) {
                System.out.print(arr2[i]+arr1[j]+" ");

            }
            System.out.println();
        }
    }
}
