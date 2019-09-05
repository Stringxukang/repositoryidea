package com.itheima;

import java.util.Scanner;

//在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
// 选手的最后得分为：去掉一个最高分和一 个最低分后 的4个评委平均值 (不考虑小数部分)。
/*
思路：
1:定义一个数组，用动态初始化完成数组元素的初始化，长度为6
2:键盘录入评委分数
3:由于是6个评委打分，所以，接收评委分数的操作，用循环改进
4:定义方法实现获取数组中的最高分(数组最大值)，调用方法
5:定义方法实现获取数组中的最低分(数组最小值) ，调用方法
6:定义方法实现获取数组中的所有元素的和(数组元素求和) ，调用方法
7:按照计算规则进行计算得到平均分
8:输出平均分
 */
public class Test10 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);

        for (int i =1; i<=6;i++){
            System.out.println("请为选手打分：");
            int score = sc.nextInt();
            arr[i-1]=score;
        }
        System.out.println("---------------");
        int max = getMax(arr);
        System.out.println("去掉一个最高分："+ max);
        int min = getMin(arr);
        System.out.println("去掉一个最低分："+ min);
        int sum = Sum(arr);
        int avg = (sum-max-min)/4;
        System.out.println("最终得分的平均分："+ avg);

    }
    //定义一个方法获取最大值
    public static int getMax(int[] arr){
        int max =arr[0];
        for (int a =0;a<=arr.length-1;a++){
        if (arr[a]>max){
            max=arr[a];
        }
        }return max;
    }
    //定义一个方法获取最小值
    public static int getMin(int[] arr){
        int min = arr[0];
        for (int b=0;b<=arr.length-1;b++){
            if (arr[b]<arr[0]){
                min = arr[b];
            }
        }
        return min;
    }
    //定义一个方法获取数组中所以元素的和
    public static int Sum(int[] arr){
        int sum =0;
        for (int j=0;j<=arr.length-1;j++){
            sum+=arr[j];
        }
        return sum;
    }
}
