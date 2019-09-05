package com.heima_01.heima_02;

import java.util.Arrays;
import java.util.Date;

import static java.lang.Integer.parseInt;

/*
* 我有如下一个字符串:”91 27 46 38 50”
* 请写代码实现最终输出结果是：”27 38 46 50 91”
* 提示：这里需要参考String类中的方法
* public String[] split(String regex)
* */
public class IntegerDemo_01 {
    public static void main(String[] args) {
        String s = "91 27 46 38 50";
        String[] str = s.split(" ");
        int[] arr = new int[str.length];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]= Integer.parseInt(str[i]);
        }
        Date d = new Date();
        System.out.println(d);
        Arrays.sort(arr);//对数组进行排序
        StringBuilder s1 = new StringBuilder();

        for (int i = 0; i <arr.length ; i++) {
            if (i==arr.length-1){
                s1.append(arr[i]);
            }else {
                s1.append(arr[i]).append(" ");
            }
        }
        String ressult = s1.toString();
        System.out.println(ressult);

    }
}
