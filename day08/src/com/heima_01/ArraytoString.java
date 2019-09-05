package com.heima_01;
//定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，
//并在控制台输出结果。例如，数组为int[] arr = {1,2,3}; ，执行方法后的输出结果为：[1, 2, 3]
public class ArraytoString {
    public static void main(String[] args) {
    int[] arr1 ={1,2,3,4};
    String s =arraytoString(arr1);
        System.out.println("s:"+s);
    }
    //两个明确
    /*返回值类型：String
        参数： int[] arr*/
    public static String arraytoString(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i <arr.length ; i++) {
            if (i==arr.length-1){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]);
                sb.append(", ");
            }
        }
        sb.append("]");
        String s = sb.toString();
        return s;
    }
}
