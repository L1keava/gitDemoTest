import java.util.Scanner;

public class scy26_zy09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int input = scanner.nextInt();
        if (isNarcissistic(input)) {
            System.out.println(input + " 是水仙花数");
        } else {
            System.out.println(input + " 不是水仙花数");
        }
    }

    public static boolean isNarcissistic(int num) {
        int x = num / 100;
        int y = num / 10 % 10;
        int z = num % 10;
        return x * x * x + y * y * y + z * z * z == num;
    }
}
