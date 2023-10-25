import java.util.Scanner;

public class scy26_zy07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三个整数：");
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        getMaxMin(a, b, c);
    }

    public static void getMaxMin(int num1, int num2, int num3) {
        int max, min;
        if (num1 > num2) {
            if (num1 > num3) {
                max = num1;
                if (num2 < num3) {
                    min = num2;
                } else {
                    min = num3;
                }
            } else {
                max = num3;
                if (num1 < num3) {
                    min = num1;
                } else {
                    min = num3;
                }
            }
        } else {
            if (num2 > num3) {
                max = num2;
                if (num1 < num3) {
                    min = num1;
                } else {
                    min = num3;
                }
            } else {
                max = num3;
                min = num1;
            }
        }
        System.out.println("最大数为：" + max);
        System.out.println("最小数为：" + min);
    }
}
