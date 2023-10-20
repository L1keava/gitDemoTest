import java.util.Scanner;

public class scy26_zy11 {
    public static void main(String[] args) {
        boolean flag = true;
        int num, input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入整数：");
        input = scanner.nextInt();
        for (num = 2; num <= input - 1; num++) {
            if (input % num == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(input + "是素数");
        } else {
            System.out.println(input + "不是素数");
        }
    }
}
