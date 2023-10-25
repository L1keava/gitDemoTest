import java.io.IOException;
import java.util.Scanner;

public class scy26_zy06 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个数字：");
        double num1 = scanner.nextDouble(), num2 = scanner.nextDouble();
        System.out.println("请输入运算符：");
        char chr = (char) System.in.read();
        calculate(num1, num2, chr);
    }

    public static void calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("运算符输入有误。（支持的有： + - * /）");
        }
    }
}
