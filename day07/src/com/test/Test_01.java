package com.test;

/* 需求：定义一个长方形类,定义求周长和面积的方法，然后定义一个测试类进行测试。
	   长方形类：
			属性：长、宽
			行为：计算周长的方法、计算面积的方法
		测试类：
			测试长方形类中的每一个方法

要求：按照封装的原则进行定义。并提供无参和全参的构造方法。 */
public class Test_01 {
    //长方形类
    private int chang;
    private int kuan;


    public Test_01() {
    }

    public Test_01(int chang, int kuan) {
        this.chang = chang;
        this.kuan = kuan;
    }

    public int getChang() {
        return chang;
    }

    public void setChang(int chang) {
        this.chang = chang;
    }

    public int getKuan() {
        return kuan;
    }

    public void setKuan(int kuan) {
        this.kuan = kuan;
    }
    public  void show(){
        int perimeter =(getChang()+getKuan())*2;
        System.out.println("长方形的周长："+perimeter);
        int area =getChang()*getKuan();
        System.out.println("长方形的面积："+area);

    }
}
