package com.test;
/* 6，小明手中有一张10元纸币。需要到商店兑换零钱。商店只有1元纸币和5角硬币。那么请列举出所有的兑换方式。打印效果如下：
换1元纸币1张，5角硬币18个
换1元纸币2张，5角硬币16个
换1元纸币3张，5角硬币14个
...   ...
换1元纸币9张，5角硬币2个 */
public class Test06 {
    public static void main(String[] args) {
        int money = 10;
        for (int i = 1; i <=10 ; i++) {
            for (int j = 2; j <=20 ; j++) {
                if (money*1.0==i+j*0.5){
                    System.out.println("换1元纸币"+i+"张，"+"5角硬币"+j+"个");
                }
            }
        }
    }
}
