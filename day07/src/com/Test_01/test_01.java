package com.Test_01;

import javax.lang.model.element.NestingKind;
import java.util.ArrayList;
import java.util.Random;

public class test_01 {
    public static void main(String[] args) {
        ArrayList array = new ArrayList();
        Random r = new Random();
        int count = 0;
        while (count<8) {
            int number = r.nextInt(20) + 1;
            if (number % 2 == 0) {
                count++;
               array.add(number);
            }
        }
        double avg =numberAvg(array);
        System.out.println("这些随机数的平均值:"+avg);
//将小于平均值的数字从集合中删除
        for (int i = 0; i <array.size() ; i++) {
            int j = (int)array.get(i);
            if (j<avg){
                array.remove(array.get(i));
            }
        }
       //遍历集合将其中的元素输出到控制台
        for (int i = 0; i <array.size() ; i++) {
            System.out.println(array.get(i));
        }
    }
    public static double numberAvg(ArrayList array){
        int sum = 0;
        for (int i = 0; i <array.size() ; i++) {
            int j = (int) array.get(i);
            sum+=j;
            System.out.println(array.get(i));
        }
        double avg = sum*1.0/array.size();
    return avg;
    }
}
