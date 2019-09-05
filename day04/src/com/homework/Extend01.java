package com.homework;
/*
	 * 有这么一个数组：int[] arr1 = {3,4,5,6,7};
	还有这么一个数组：int[] arr2 = {0,9,5,2,7};
	现在要求合并这两个数组，生成一个新的数组，合并后得到的数组为arr3，arr3是这样的：arr3 = {3,4,5,6,7,0,9,5,2,7}
	也就是把arr1和arr2数组中的元素拼接起来，放到arr3数组中，最后遍历arr3
	 */
public class Extend01 {
    public static void main(String[] args) {
        int[] arr1 = {3,4,5,6,7};
        int[] arr2 = {0,9,5,2,7};
        int[] arr3 = new int[arr1.length+arr2.length];
        for (int j = 0; j <arr1.length ; j++) {
            arr3[j]=arr1[j];
        }
        for (int k = 0; k <arr2.length ; k++) {
            arr3[arr1.length+k]=arr2[k];
            }
        for (int i = 0; i < 10; i++) {
            System.out.println(arr3[i]);
        }

    }
}
