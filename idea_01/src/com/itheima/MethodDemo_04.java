package com.itheima;
/*需求：设计一个方法用于数组遍历，要求遍历的结果是在一行上的。例如：[11, 22, 33, 44, 55]
        思路：
        ①因为要求结果在一行上输出，所以这里需要在学习一个新的输出语句System.out.print(“内容”);
        System.out.println(“内容”); 输出内容并换行
        System.out.print(“内容”); 输出内容不换行
        System.out.println(); 起到换行的作用
        ②定义一个数组，用静态初始化完成数组元素初始化
        ③定义一个方法，用数组遍历通用格式对数组进行遍历
        ④用新的输出语句修改遍历操作
        ⑤调用遍历方法*/
public class MethodDemo_04 {
    public static void main(String[] args) {
        int[] arr ={11,12,13,14,15,16};

        Arr(arr);
    }
    public static void Arr(int[] arr){
        for (int x = 0;x<arr.length;x++){
            if (x == 0){
                System.out.print("[" + arr[x] + ",");
            }else if (x == (arr.length - 1)){
                System.out.print(arr[x] + "]");
            }else {
                System.out.print(arr[x] + ",");
            }
        }

    }
}
