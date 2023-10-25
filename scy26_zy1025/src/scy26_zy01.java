import java.util.Scanner;
public class scy26_zy01 {
    public static void main(String[] args) {
        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入三条边长：");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (a + b > c) {
            System.out.println("子程序返回结果为：" + getArea(a, b, c));
        } else {
            System.out.println("不是三角形！");
        }
    }

    public static double getArea(double x, double y, double z) {
        double s = (x + y + z) / 2;
        double result = Math.sqrt(s * (s - x) * (s - y) * (s - z));
        System.out.println("面积为：" + result);
        return result;
    }
}
