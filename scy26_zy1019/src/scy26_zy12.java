import java.util.Scanner;

public class scy26_zy12 {
    public static void main(String[] args) {
        int num, input, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入整数：");
        input = scanner.nextInt();
        for (num = 1; num <= input - 1; num++) {
            if (input % num == 0) {
                sum += num;
            }
        }
        if (sum == input) {
            System.out.println(input + "是完数");
        } else {
            System.out.println(input + "不是完数");
        }
    }
}