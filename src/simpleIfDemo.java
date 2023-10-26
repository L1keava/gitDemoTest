import java.util.Scanner;

public class simpleIfDemo {
    public static void main(String[] args) {
        float number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入分数：");
        number = scanner.nextFloat();
        if (number < 60) {
            System.out.println("需要补考！");
        } else {
            System.out.println("不需要补考");
        }
        int num;
        num = (int) number;
        System.out.println("将浮点型转换为整型...");
        if (num % 2 == 0) {
            System.out.println("你输入的数是偶数");
        } else {
            System.out.println("你输入的数是奇数");
        }
    }
}
