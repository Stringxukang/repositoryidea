package com.test;
/* 1，身高是具有遗传性的，子女的身高和父母的身高有一定的关系。
假定，父母和子女的身高遗传关系如下：
儿子身高（厘米）＝(父亲身高＋母亲身高) ×1.08÷2
女儿身高（厘米）＝(父亲身高×0.923＋母亲身高) ÷2

现有父亲身高177CM,母亲身高165CM。求子女身高分别预计为多少？ */
public class Test01 {
    public static void main(String[] args) {
        height(172,160);
    }

    public static void height(double father,double mother){
        double son =(father+mother)*1.08/2;
        double daughter =(father*0.923+mother)/2;
        System.out.println("儿子的身高是："+son+"cm");
        System.out.println("女儿的身高是："+daughter+"cm");
    }
}
