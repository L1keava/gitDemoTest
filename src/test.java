import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        double a, b, c, mj;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个数");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        if (a + b > c && a + c > b && b + c > a) {
            mj = sum(a, b, c);
            System.out.println();
        } else {
            System.out.println("三角形构不成三角形");
        }
    }

    public static double sum(double a, double b, double c) {
        double s;
        s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
