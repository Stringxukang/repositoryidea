package com.test;

import java.util.Scanner;

/*2，
	2019年1月1日起，国家推出新的个人所得税政策，起征点上调值5000元。也就是说税前工资扣除三险一金（三险一金数额假设是税前工资的10%）后如果不足5000元，则不交税。如果大于5000元，那么大于5000元的部分按梯度交税，具体梯度比例如下：
	0 ~ 3000元的部分，交税3%
	3000 ~ 12000元的部分，交税10%
	12000 ~ 25000的部分 ， 交税20%
	25000 ~ 35000的部分，交税25%
	35000 ~ 55000的部分，交税30%
	55000 ~ 80000的部分，交税35%
	超过80000的部分，交税45%
比如：黑马某学员入职一家企业后，税前工资是15000，则他每月该交个税的部分是15000-1500-5000=8500元，个税缴纳数额是3000×3%+5500×10%=640元。税后工资12860元。
请完成一个个税计算程序，在用户输入税前工资后，计算出他对应的纳税数额，以及税后工资为多少？
*/
public class Extend02 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("请输入您的税前工资：");
         double money = sc.nextInt();
         salary(money);
     }
    public static void salary(double money){
        double money1=0;
        double paytaxes=0;//个税缴纳数额
        if (money>5000){
            money1 =money-money*0.1-5000;//每月该交个税的部分 17500
            if (money1<=3000){
                paytaxes =money1*0.03;
            }else if (money1>3000&&money1<=12000){
                paytaxes=3000*0.03+(money1-3000)*0.1;
            }else if (money1>12000&&money1<=25000){
                paytaxes=3000*0.03+9000*0.1+(money1-12000)*0.2;
            }else if (money1>25000&&money1<=35000){
                paytaxes=3000*0.03+9000*0.1+13000*0.2+(money1-25000)*0.25;
            }else if (money1>35000&&money1<=55000){
                paytaxes=3000*0.03+9000*0.1+13000*0.2+10000*0.25+(money1-35000)*0.3;
            }else if (money1>55000&&money1<=80000){
                paytaxes =3000*0.03+9000*0.1+13000*0.2+10000*0.25+20000*0.3+(money1-55000)*0.35;
            }else {
                paytaxes =3000*0.03+9000*0.1+13000*0.2+10000*0.25+20000*0.3+25000*0.35+(money1-80000)*0.45;
            }
        }else{
            paytaxes =0;
        }
        System.out.println("纳税数额:"+paytaxes+"税后工资:"+(money-paytaxes-money*0.1));
    }
}
