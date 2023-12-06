import java.util.Scanner;

interface xz {
    double pi = 3.14;

    double getPerimeter(double r);
}

interface xz1 extends xz {
    void printPerimeter(double r);
}

abstract class yuanxing implements xz {
    public yuanxing() {
    }

    double r;
    private final double pi = 3.14;

    public abstract double getArea(double r);

    public double getPerimeter(double r) {
        return 2 * pi * r;
    }

    final void  print() {
        System.out.println("圆的半径为：" + r + "，圆的周长为：" + getPerimeter(r) + "圆的面积为：" + getArea(r));
    }
}

class yuanzhu extends yuanxing implements xz, xz1 {
    double h;

    public yuanzhu() {
    }

    public yuanzhu(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public double getPerimeter(double r) {
        return 2 * pi * r;
    }

    public double getArea(double r) {
        return pi * r * r;
    }

    public void printPerimeter(double r) {
        System.out.println(getPerimeter(r));
    }

    public double getTj(double r, double h) {
        return pi * r * r * h * h;
    }

    @Override
    public String toString() {
        return "圆柱的半径为：" + r + "，高为：" + h + "，周长为：" + getPerimeter(r) + "，面积为：" + getArea(r) + "，体积为：" + getTj(r, h);
    }
}

class yuanzhui extends yuanzhu {

    public yuanzhui(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public double getZTj(double r, double h) {
        return (3.14 * r * r * h) / 3;
    }

    @Override
    public String toString() {
        return "圆锥的半径为：" + r + "，圆锥的高为：" + h + "，圆锥的底面积为：" + getArea(r) + "，圆锥的体积为：" + getZTj(r, h);
    }
}

public class scy26_zy03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        yuanzhu[] yuanzhuArr = new yuanzhu[1];
        System.out.println("请输入圆柱的半径和高：");
        yuanzhuArr[0] = new yuanzhu(scanner.nextDouble(), scanner.nextDouble());
        System.out.println(yuanzhuArr[0]);
        yuanzhui[] yuanzhuiArr = new yuanzhui[1];
        System.out.println("请输入圆锥的半径和高");
        yuanzhuiArr[0] = new yuanzhui(scanner.nextDouble(), scanner.nextDouble());
        System.out.println(yuanzhuiArr[0]);
    }
}
