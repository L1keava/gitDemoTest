import java.util.Scanner;

abstract class yuan {
    double r;
    final double pi = 3.14;

    abstract double area(double r);
}

class yz extends yuan {
    double r, h;
    final double pi = 3.14;

    double area(double r) {
        return pi * r * r;
    }

    double tj(double r, double h) {
        return area(r) * h;
    }

    @Override
    public String toString() {
        return "体积为：" + tj(r, h);
    }
}

public class scy26_zy01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        yz yz1 = new yz();
        System.out.println("请输入圆柱体的半径和高：");
        yz1.r = scanner.nextDouble();
        yz1.h = scanner.nextDouble();
        System.out.println(yz1);
    }
}
