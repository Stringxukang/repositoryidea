package 徐康;
//遍历1000-2000,求出范围内所有满足条件的元素之和.
//		条件: 个位+十位+百位+千位=10
//
public class Test03 {
    public static void main(String[] args) {
        int sum =0;
        for (int i = 1000; i <=2000 ; i++) {
            int ge = i%10;
            int shi =i/10%10;
            int bai = i/100%10;
            int qian = i/1000%10;

            if ((ge+shi+bai+qian)==10){
                sum+=i;
            }

        }
        System.out.println("满足条件的元素之和为："+ sum);
    }
}
