package com.test;
/*7，鸡兔同笼,共有98个头,386只脚,请用穷举法编程计算鸡,兔各有多少只.*/
public class Test07 {
    public static void main(String[] args) {
        //设鸡的数量为i，兔的数量为j
        //2i+4j=386 i+j=98
        for (int i = 0; i <98 ; i++) {
            for (int j = 0; j <98 ; j++) {
                if (386==(2*i+4*j)&&(98==i+j)){
                    System.out.println("鸡的数量为："+i+",鸭的数量为："+j);
                }
            }
        }
    }
}
