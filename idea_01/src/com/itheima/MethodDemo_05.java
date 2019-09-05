package com.itheima;
/*需求：设计一个方法用于获取数组中元素的最大值
        思路：
        ①定义一个数组，用静态初始化完成数组元素初始化
        ②定义一个方法，用来获取数组中的最大值，最值的认知和讲解我们在数组中已经讲解过了
        ③调用获取最大值方法，用变量接收返回结果
        ④把结果输出在控制台*/
public class MethodDemo_05 {
    public static void main(String[] args) {
       int[] arr ={11,122,33,44,155,66};
        int result = Max(arr);
        System.out.println(result);

    }
    public static int Max(int[] arr){
        int max = arr[0];
        for (int x =1;x<arr.length;x++){
            if (max>arr[x]){

            }else {
                max = arr[x];

            }
        }
        return max;
    }
}
