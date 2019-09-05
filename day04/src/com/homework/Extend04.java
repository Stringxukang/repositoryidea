package com.homework;
/*
	 * 分析以下需求，并用代码实现
	有一个二维数组，数组中的元素固定是下面的元素，是写死的，如下：
	int[][] arr = {
		{1, 11, 3, 0},//这是第一行
		{4, 234,9, 5},//这是第二行
		{32,12,22,87} //这是第三行
	};


	1、把arr数组中的最大的那个数打印出来（也就是234）

	2、根据arr数组，把每一行的最大值，找出来，存放到maxArr数组中，最终得到的maxArr数组是这样的：maxArr = {11,234,87}
	*/
public class Extend04 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 11, 3, 0},//这是第一行
                {4, 234, 9, 5},//这是第二行
                {32, 12, 22, 87} //这是第三行
        };
        int[] maxArr = new int[3];
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        int[] arr3 = new int[3];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                arr1 = arr[i];
            }
            if (i == 1) {
                arr2 = arr[i];
            } else {
                arr3 = arr[i];
            }

        }
        maxArr[0] =getMax(arr1);
        maxArr[1] =getMax(arr2);
        maxArr[2] =getMax(arr3);

        int max =maxArr[0];
        for (int i= 0;i<maxArr.length;i++){
         if (maxArr[i]>max){
             max= maxArr[i];
         }
            System.out.println(maxArr[i]);
        }
        System.out.println("arr数组中的最大数为："+max);
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }
        return max;
    }

}


