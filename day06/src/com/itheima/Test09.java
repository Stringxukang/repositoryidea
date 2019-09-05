package com.itheima;

public class Test09 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66};
        //变量交换
        for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
        }
        printArry(arr);//函数调用
    }
//定义一个函数来遍历数组
    /*
    2个明确：
        返回值类型：void
        参数：int[] arr
     */
    public static void printArry(int[] arr) {
        System.out.print("[");
        for (int i= 1;i<arr.length;i++){
            if (i==arr.length-1){
                System.out.print(arr[i]);//数组中最后一个元素输出
            }else{
                System.out.print(arr[i]+ ",");
            }
        }
        System.out.println("]");
    }
}
