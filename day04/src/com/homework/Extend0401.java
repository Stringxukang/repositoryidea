package com.homework;

public class Extend0401 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 11, 3, 0},//这是第一行
                {4, 234,9, 5},//这是第二行
                {32,12,22,87} //这是第三行
        };
        int max = arr[0][0];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
