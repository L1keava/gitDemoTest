import java.util.Scanner;

public class scy26_zy10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.println("请输入三个数：");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        function(a, b, c);
    }

    public static void function(double a, double b, double c) {
        if (a == 0) {
            System.out.println("不是二次方程");
            return;
        }
        double delta = b * b - 4 * a * c;
        if (delta >= 0) {
            if (delta > 0) {
                double root1 = (-b + Math.sqrt(delta)) / 2 * a;
                double root2 = (-b - Math.sqrt(delta)) / 2 * a;
                System.out.println("x(1) = " + root1);
                System.out.println("x(2) = " + root2);
            } else {
                //delta = 0时的情况
                double root = b / -2 * a;
                System.out.println("x = " + root);
            }
        } else {
            System.out.println("有两个虚根");
        }
    }
}
