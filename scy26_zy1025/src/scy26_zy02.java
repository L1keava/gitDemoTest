import java.util.Scanner;

public class scy26_zy02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int input = scanner.nextInt();
        if (isPrime(input)) {
            System.out.println(input + " 是素数");
        } else {
            System.out.println(input + " 不是素数");
        }
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
