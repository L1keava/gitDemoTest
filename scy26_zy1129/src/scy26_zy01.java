import java.util.Scanner;

class shape {
    double r, length, width, a, b, c;

    public shape(double r) {
        this.r = r;
    }

    public shape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public shape(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getR() {
        return r;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    double getPerimeter(double r) {
        return 3.14 * (2 * r);
    }

    double getPerimeter(double length, double width) {
        return (length + width) * 2;
    }

    double getPerimeter(double a, double b, double c) {
        return a + b + c;
    }

    double getArea(double r) {
        return 3.14 * r * r;
    }

    double getArea(double length, double width) {
        return length * width;
    }

    double getArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    void print(double r) {
        System.out.println("圆的半径为：" + r + " 周长为：" + getPerimeter(r)
                + " 面积为：" + getArea(r));
    }

    void print(double length, double width) {
        System.out.println("长方形的长为：" + length + " 宽为：" + width + " 周长为："
                + getPerimeter(length, width) + " 面积为：" + getArea(length, width));
    }

    void print(double a, double b, double c) {
        System.out.println("三角形的三条边为：" + a + "," + b + "," + c + " 周长为：" + getPerimeter(a, b, c)
                + " 面积为：" + getArea(a, b, c));
    }
}

public class scy26_zy01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入圆的半径：");
        shape yuan = new shape(scanner.nextDouble());
        yuan.print(yuan.getR());
        System.out.println("请输入长方形的长和宽：");
        shape cfx = new shape(scanner.nextDouble(), scanner.nextDouble());
        cfx.print(cfx.getLength(), cfx.getWidth());
        System.out.println("请输入三角形的三条边：");
        shape sjx = new shape(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        sjx.print(sjx.getA(), sjx.getB(), sjx.getC());
    }
}
