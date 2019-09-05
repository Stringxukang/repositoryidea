package com.heima_09;

public class Parallelogram extends Quadrangle{
    public static void main(String[] args) {
        Quadrangle q = new Quadrangle();
        if (q instanceof Parallelogram){//判断为true 执行向下转型操作
           Parallelogram p = (Parallelogram) q;
        }
        if (q instanceof Square){
            Square s = (Square) q;
        }
        //因为q对象不是Anything类的对象，所以下面这条语句是错误的
//        System.out.println(q instanceof Anything);

    }
}
