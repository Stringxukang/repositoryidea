package com.itheima;

import javax.xml.transform.sax.SAXSource;

public class ArrayDemo_01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int max = arr[0];//定义一个变量，去数组中第一个值为初始值
        //用for循环来遍历数组中的所有元素
        for (int x = 0; x < arr.length; x++) {
            //if条件进行判断谁的值最大，把值最大的元素重新赋值给max
            if (arr[x] > max){
                max = arr[x];
            }

        }
        System.out.println(max);
        /*System.out.println(arr);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[0]);
*/
    }
}
