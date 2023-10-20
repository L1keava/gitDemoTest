import java.util.Scanner;
public class scy26_zy09 {
    public static void main(String[] args) {
        int num, var = 1, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入整数：");
        num = scanner.nextInt();
        while (var < num) {
            if (num % var == 0) {
                sum += var;
            }
            var++;
        }
        if (sum == num) {
            System.out.println(num + "是完数");
        } else {
            System.out.println(num + "不是完数");
        }
    }
}