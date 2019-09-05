package com.test;

import javax.lang.model.element.NestingKind;

/*5，小李用自己的钱买了十只股票，年末他看了各只股票的收益分别是10.4%,-3%,-6.2%,1.2%,-6.1%,-19%,-3.8%,0.9%,-4.5%,5.5%。请使用数组相关知识编程，帮他统计赚钱的股票和赔钱的股票分别有多少只？打印效果如下：
赚钱的股票一共有：4只
赔钱的股票一共有：6只 */
public class Extend05 {
    public static void main(String[] args) {
        double[] arr = {0.104, -0.03, -0.062, 0.012,-0.061,-0.19,-0.038,0.009, -0.045, 0.055};
        int count1 = 0;//赚钱的股票
        int count2 = 0;//赔钱的股票
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count1++;
            } else {
                count2++;
            }
        }
        System.out.println("赚钱的股票一共有：" + count1 + "只");
        System.out.println("赚钱的股票一共有：" + count2 + "只");
    }
}
