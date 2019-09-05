package com;

import java.util.ArrayList;

/*
一、	请按以下要求编写代码：
1.	定义一个只能存储字符串的集合对象；
2.	向集合内添加以下数据：
		“孙悟空”
		“猪八戒”
		“沙和尚”
		“铁扇公主”
3.	不用遍历，直接打印集合；
4.	获取第4个元素（注意，是--第4个元素，它的索引是？）
5.	打印一下集合大小；
6.	删除元素“铁扇公主”
7.	删除第3个元素（注意：是--第3个元素）
8.	将元素“猪八戒”改为“猪悟能”
9.	再次打印集合；
* */
public class Test_01 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("孙悟空");
        array.add("猪八戒");
        array.add("沙和尚");
        array.add("铁扇公主");
        //不用遍历，直接打印集合；
        System.out.println(array);
        //获取第4个元素（注意，是--第4个元素，它的索引是？）
        System.out.println(array.get(3));
        //打印一下集合大小
        System.out.println(array.size());
        //删除元素“铁扇公主”
        array.remove("铁扇公主");
        //删除第3个元素（注意：是--第3个元素）
        array.remove(2);
        //将元素“猪八戒”改为“猪悟能”
        array.set(1,"猪无能");
        System.out.println(array);

    }
}
