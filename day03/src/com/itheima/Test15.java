package com.itheima;
//*****
// ****
//  ***
//   **
//    *
/*
外层控制行数
行数      空格数     *数
1           0          5
2           1          4
3           2          3
4           3          2
5           4          1
 */
public class Test15 {
    public static void main(String[] args) {
        for (int index = 0; index < 5; index++) {//控制输出多少行

            for (int space = 0; space < index; space++) {//输出空格
                System.out.print(" ");
            }

            for (int mark = 0; mark < (5 - index); mark++) {//每行输出多少个 *
                System.out.print("*");
            }

            System.out.println();//换行输出
//
//        for (int i = 1; i<=5; i++){
//            System.out.print("*");
//        }
//        System.out.println();
//        System.out.print(" ");
//
//        for (int i = 1; i<=4; i++){
//
//            System.out.print("*");
//        }
//        System.out.println();
//        System.out.print(" ");
//        System.out.print(" ");
//
//        for (int i = 1; i<=3; i++){
//
//            System.out.print("*");
//        }
//        System.out.println();
//        System.out.print(" ");
//        System.out.print(" ");
//        System.out.print(" ");
//
//        for (int i = 1; i<=2; i++){
//
//            System.out.print("*");
//        }
//        System.out.println();
//        System.out.print(" ");
//        System.out.print(" ");
//        System.out.print(" ");
//        System.out.print(" ");
//
//        for (int i = 1; i<=1; i++){
//
//            System.out.print("*");
//        }
//        System.out.println();
//        System.out.print(" ");
//        System.out.print(" ");
//        System.out.print(" ");
//        System.out.print(" ");
//        System.out.print(" ");


        }
    }
}
