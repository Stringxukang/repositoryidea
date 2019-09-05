package 徐康;

import java.util.Random;

//1.定义一个长度为5的int类型数组,数据由随机数产生(54-89)
//	2.找出其中的最大值,最小值,并在控制台上打印出来
//	3.将最大值和最小值交换位置,再遍历打印数组
//		提示:交换位置的关键在于要保存最大值和最小值的索引,通过索引交换位置
public class Test05 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random r = new Random();
        int max = 0;
        int min =89;
        int j =0;
        int k = 0;
        int temp =0;
        for (int i = 0; i <arr.length ; i++) {
            int number = r.nextInt(36)+54;
                arr[i]=number;
            if (arr[i]>max){
                max=arr[i];
                j=i;
            }
            if (arr[i]<min){
                min = arr[i];
                k=i;
            }
            System.out.print(arr[i]);
        }
        System.out.println("最大值为："+ max);
        System.out.println("最小值为："+ min);
            temp = arr[j];
            arr[j]=arr[k];
            arr[k]=temp;
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

    }
}
