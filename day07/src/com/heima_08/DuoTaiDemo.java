package com.heima_08;

import java.sql.SQLOutput;

/*
 * 多态的好处：提高了程序的扩展性
 * 		具体体现：定义方法的时候，使用父类型作为参数，将来在使用的时候，使用具体的子类型参与操作。
 * 多态的弊端：不能使用子类的特有功能
 */
/*向上转型
    从子到父
    父类应用指向子类对象
   向下转型
     从父到子
     父类引用转为子类对象
* */
public class DuoTaiDemo {
    public static void main(String[] args) {
        AnimalOperator ao =new AnimalOperator();
        Dog d = new Dog();
        ao.useAnimal(d);

        /*Integer num = new Integer("45");
        System.out.println(num);*/

        Animal c = new Cat();//向上转型
        c.eat();
        Cat a =(Cat)c; //向下转型
        a.palyGame();//用转换方法来解决多态的弊端，

    }


}
