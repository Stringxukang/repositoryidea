package com.heima;

public class Test04 {
    public static void main(String[] args) {
        printXX(2, 3);
    }

    public static void printXX(int m, int n) {
        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
