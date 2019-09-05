package 徐康;

import java.util.Random;

//1.定义一个长度为10的int类型数组,数据由随机数产生(1-100)
//	2.求出该数组的平均数,以及大于平均数的元素个数.
public class Test04 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(100) + 1;
            arr[i] = number;
            sum += i;
        }
        int count = 0;//统计大于平均数的元素个数
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > avg) {
                count++;
            }
        }
        avg = sum / 10;
        System.out.println("该数组的平均数:" + avg);
        System.out.println("大于平均数的元素个数：" + count);
    }
}
