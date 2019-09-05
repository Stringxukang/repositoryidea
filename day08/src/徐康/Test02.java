package 徐康;
//遍历1-100,求出范围内,偶数的平均数与奇数的平均数
public class Test02 {
    public static void main(String[] args) {
        int sum1 = 0;
        int count1 = 0;
        int sum2 =0;
        int count2 =0;
        for (int i = 1; i <=100 ; i++) {
            if (i%2==0){
                sum1+=i;
                count1++;
            }else {
                sum2+=i;
                count2++;
            }

        }
        System.out.println("偶数的平均数为："+ (sum1/count1));
        System.out.println("奇数的平均数为："+ (sum2/count2));

    }
}
