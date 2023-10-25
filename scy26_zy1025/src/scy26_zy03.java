import java.util.Scanner;

public class scy26_zy03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入x的值：");
        double x = scanner.nextDouble();
        System.out.println("y = " + function(x));
    }

    public static double function(double x) {
        if (x > 0) {
            return 5 * x + 2;
        } else if (x < 0) {
            return 5 * x - 2;
        } else {
            return 5 * x;
        }
    }
}