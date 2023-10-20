import java.util.Scanner;
public class scy26_zy10 {
    public static void main(String[] args) {
        int num = 2, input;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入整数：");
        input = scanner.nextInt();
        while (num <= input - 1) {
            if (input % num == 0) {
                flag = false;
                break;
            }
            num++;
        }
        if (flag) {
            System.out.println(input + "是素数");
        } else {
            System.out.println(input + "不是素数");
        }
    }
}
