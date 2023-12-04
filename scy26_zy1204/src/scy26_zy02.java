import java.util.Scanner;

abstract class xzs {
    double a, b, c;

    abstract double getPerimeter(double a, double b, double c);

    abstract double getArea(double a, double b, double c);
}

class sjx extends xzs {
    double a, b, c, h;

    public sjx(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    double getPerimeter(double a, double b, double c) {
        return a + b + c;
    }

    double getArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    double tj(double a, double b, double c, double h) {
        return getArea(a, b, c) * h;
    }

    String info() {
        return "周长为：" + getPerimeter(a, b, c) + "，面积为：" + getArea(a, b, c);
    }

}

public class scy26_zy02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三角形的三条边以及高：");
        sjx sjx1 = new sjx(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        System.out.println(sjx1.info());
    }
}
