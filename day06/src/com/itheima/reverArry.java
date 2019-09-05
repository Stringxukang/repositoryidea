package com.itheima;
//反转数组中的元素
public class reverArry {
    public static void main(String[] args) {
        int[] arr ={19,28,37,46,50};
        int[] arr1 =new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            arr1[arr.length-1-i]=arr[i];
        }
        for (int j = 0; j <arr.length ; j++) {
            System.out.println(arr[j]);
        }
    }
}
