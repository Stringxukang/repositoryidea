package com.heima01;
//冒泡排序
public class arrayDemo {
    public static void main(String[] args) {
        int[] arr = {1,5,7,37,0,3,9};
        sort(arr);
        printArry(arr);
    }
    public static void sort(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if (arr[j]>arr[j+1]){//相邻的2个元素进行对比，定义temp用于交换
                    int temp =0;
                    temp =arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    //遍历数组
    public static void printArry(int[] arr){
        System.out.print("[");
        for (int i = 0; i <arr.length ; i++) {
            if (i==arr.length-1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i]+",");
            }
        }
        System.out.println("]");
    }
}


