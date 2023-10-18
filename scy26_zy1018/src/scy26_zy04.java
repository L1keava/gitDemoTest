import java.io.IOException;
import java.util.Scanner;

public class scy26_zy04 {
    public static void main(String[] args) throws IOException {
        double num1, num2, result;
        char operator;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个操作数：");
        num1 = scanner.nextDouble();
        System.out.println("请输入运算符，可接受的运算符有：+ - * / ^ %");
        operator = (char) System.in.read();
        System.out.println("请输入第二个操作数：");
        num2 = scanner.nextDouble();
        switch (operator) {
            case '+':
                //在这里写加法的逻辑
                result = add(num1, num2);
                System.out.println(num1 + "+" + num2 + "的结果为：" + result);
                break;
            case '-':
                //在这里写减法的逻辑
                result = subtract(num1, num2);
                System.out.println(num1 + "-" + num2 + "的结果为：" + result);
                break;
            case '*':
                //在这里写乘法的逻辑
                result = multiply(num1, num2);
                System.out.println(num1 + "*" + num2 + "的结果为：" + result);
                break;
            case '/':
                //在这里写除法的逻辑
                result = divide(num1, num2);
                System.out.println(num1 + "/" + num2 + "的结果为：" + result);
                break;
            case '^':
                //在这里写乘方的逻辑
                result = power(num1, num2);
                System.out.println(num1 + "^" + num2 + "的结果为：" + result);
                break;
            case '%':
                //在这里写取余的逻辑
                result = mod(num1, num2);
                System.out.println(num1 + "%" + num2 + "的结果为：" + result);
                break;
            default:
                //在这里写异常情况
                System.out.println("运算符输入错误，可接受的运算符有：+ - * / ^ %");
        }
    }

    public static double add(double num1, double num2) {
        return num1 + num2;

    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }

    public static double power(double num1, double num2) {
        double result = 1;
        for (int i = 1; i <= num2; i++) {
            result = result * num1;
        }
        return result;
    }

    public static double mod(double num1, double num2) {
        return num1 % num2;
    }
}

