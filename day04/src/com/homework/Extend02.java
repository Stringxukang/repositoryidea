package com.homework;

import java.awt.font.FontRenderContext;

/*
	 * 间接的拼接两个数组。
	有一个数组：int[] arr1 = {2,5,8};
	另一个数组：String[] arr2 = {"a", "b", "c"};
	间接的拼接，得到Stirng[] arr3 如下:

	arr3 = {"a","2","b","5","c","8"};
	最后遍历这个数组
	 */
public class Extend02 {
    public static void main(String[] args) {
        int[] arr1 = {2,5,8};
        String[] arr2 = {"a", "b", "c"};
        /*String[] arr = new String[3];*/
        String[] arr3 = new String[6];
 /*       for (int i = 0; i <3 ; i++) {
            arr[i]= String.valueOf(arr1[i]);
        }
        for (int j = 0; j <arr.length ; j++) {
            arr3[j]=arr[j];
        }
        for (int k = 0; k <arr2.length ; k++) {
            arr3[arr.length+k]=arr2[k];
        }
        for (int m = 0; m <6 ; m++) {
            System.out.println(arr3[m]);

        }*/
             int count1 = 0;
             int count2 = 0;

        for (int i = 0; i <arr3.length ; i++) {
            if (i%2==0){
                arr3[i]=arr2[count1];
                count1++;
            }else {
                arr3[i]=arr1[count2]+"";
                count2++;
            }
            System.out.println(arr3[i]);
        }
    }
}
