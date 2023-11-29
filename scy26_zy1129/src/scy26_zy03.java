import java.util.Scanner;

class yuan {
    double r;
    private final double pi = 3.14;

    public yuan(double r) {
        this.r = r;
    }

    public yuan() {
    }

    double getArea() {
        return pi * r * r;
    }

    void print() {
        System.out.println("圆的半径为：" + r + " 面积为：" + getArea());
    }
}

class yzt extends yuan {
    double r, h;

    public yzt(double r, double h) {
        this.r = r;
        this.h = h;
    }

    final double pi = 3.14;

    double getTj() {
        return pi * r * r * h;
    }

    @Override
    public String toString() {
        return "圆柱体的半径为：" + r + " 高为：" + h + " 体积为：" + getTj();
    }
}

public class scy26_zy03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入圆的半径：");
        yuan yuan1 = new yuan(scanner.nextDouble());
        yuan1.print();
        System.out.println("请输入圆柱体的高和宽：");
        yzt yzt1 = new yzt(scanner.nextDouble(), scanner.nextDouble());
        System.out.println(yzt1);
    }
}
