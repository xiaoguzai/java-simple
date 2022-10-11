import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //需求1：获取arr数组中，3索引上的值
        int number = arr[3];
        System.out.println(number);
        System.out.println(arr[3]);
        System.out.println(arr.length);
        //需求2：将arr数组中，3索引上的值修改为10
        arr[3] = 10;
        System.out.println("修改之后为:" + arr[3]);
    }
}
