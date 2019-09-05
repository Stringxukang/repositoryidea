package com.test;

public class Extend_01 {
    public static void main(String[] args) {
        Manager s1 = new Manager();
        s1.setName("大逼哥");
        s1.setId(250);
        s1.setBonus(250);
        s1.setSalary(1);
        s1.work();

        Coder s2 = new Coder("饶彬", 250, 1);
        s2.work();
    }

}
