import java.util.Scanner;

public class scy26_zy08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("请输入三个整数：");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        sort(a, b, c);
    }

    public static void sort(int a, int b, int c) {
        int first, second, third;
        if (a > b) {
            if (a > c) {
                first = a;
                //a为最大值
                if (b > c) {
                    second = b;
                    third = c;
                } else {
                    second = c;
                    third = b;
                }
            } else {
                //c为最大值
                first = c;
                second = a;
                third = b;

            }
        } else {
            //b>a的情况
            if (b > c) {
                first = b;
                //b为最大值
                if (a > c) {
                    second = a;
                    third = c;
                } else {
                    second = c;
                    third = a;
                }
            } else {
                first = c;
                //c为最大值 a<b b<c
                if (a < b) {
                    third = a;
                    second = b;
                } else {
                    third = b;
                    second = a;
                }
            }
        }
        System.out.println("排序前：" + a + " " + b + " " + c);
        System.out.println("排序后：" + first + " " + second + " " + third);
    }
}
