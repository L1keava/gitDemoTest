import java.util.Scanner;

class yuan {
    private double r;

    public yuan() {}

    public yuan(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    double getArea() {
        return 3.14 * r * r;
    }

    @Override
    public String toString() {
        return "半径：" + r + " 面积：" + getArea();
    }
}

class yzt extends yuan {
    double height;

    double getTj() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "圆柱体的半径：" + super.getR() + "圆柱体的体积：" + getTj();
    }
}

public class extendsTest {
    public static void main(String[] args) {
        System.out.println("请输入半径：");
        Scanner scanner = new Scanner(System.in);
        yuan yuan = new yuan(scanner.nextDouble());
        System.out.println("半径为 " + yuan.getR() + " 的圆的面积为：" + yuan.getArea());
        yzt yzt1 = new yzt();
        yzt1.height = 5;
        System.out.println(yzt1);
    }
}