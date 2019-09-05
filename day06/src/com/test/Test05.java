package com.test;
/* 5，有一个整数数组。请编写代码，让数组的最后一个元素代表个位，倒数第二个元素代表十位，以此类推。最终得到一个大的整数。比如：
原数组：{1,2,3,4,5}
最终得到的结果： 12345 */
public class Test05 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        getNumber(arr);
    }
 /*   public static void getNumber(int[] arr){
        String s ="";
        for (int i = 0; i <arr.length ; i++) {
            s+=arr[i];
        }
        System.out.println(s);
    }*/
 public static void getNumber(int[] arr){
     int sum = 0;
     for (int i = 0; i <arr.length ; i++) {
         sum=sum*10+arr[i];
     }
     System.out.println(sum);
 }
}
