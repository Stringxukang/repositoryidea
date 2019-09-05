package com.heima;

public class Phone {
    //定义成员变量
    String brand;//String brand;
    int price;// int price;
    String color;
    public Phone(){}//无参构造方法
    //有参构造方法
    public Phone(String brand,int price,String color){
        this.brand = brand;
        this.price = price;
        this.color = color;
    }
    //定成员方法
    public void call(){
        System.out.println("正在使用价格为"+price+"元"+color+"的"+brand+"手机打电话....");
    }
    public void sendEmail(){
        System.out.println("正在使用价格为"+price+"元"+color+"的"+brand+"手机打发短信....");
    }

}
