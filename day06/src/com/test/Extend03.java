package com.test;
/* 3，有一个容量为10L的空水桶。水桶的上面开始往里灌水，同时下面开始往出流水。
第一分钟灌水的速度是1L/min，第二分钟灌水的速度是2L/min，第三分钟灌水的速度是3L/min，
以此类推。而流水的速度固定是3L/min。那么几分钟之后，水桶里能保持灌满水的状态？ */
/*1 1   3   0
  2 2   3   0
  3 3   3   0
  4 4   3   1
  5 5   3   3
  6 6   3   7
  7 7   3   11
* */



public class Extend03 {
    public static void main(String[] args) {
        int water =10;
        fullWater(water);
    }
    public static void fullWater(int water){
        int water1 = 0;//桶里的水
        for (int i = 3; i <=10 ; i++) {
            //3分钟之前桶里的水一直为0L i>=3
            //每分钟的相对出水量() i-3
            water1=water1+(i-3);
            if (water1>=water){
                System.out.println(i+"分钟后，水桶里能保持灌满水的状态");
                break;
            }
        }
    }
}
