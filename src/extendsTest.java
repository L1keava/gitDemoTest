import java.util.Scanner;

class yuan {
    double r;

    public yuan() {
    }

    public yuan(double r) {
        this.r = r;
    }

    public double getR() {
        return this.r;
    }

    double getArea() {
        return 3.14 * this.r * this.r;
    }

    @Override
    public String toString() {
        return "半径：" + this.r + " 面积：" + getArea();
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
        System.out.println("请输入圆柱体的高：");
        yzt1.r = yuan.r;
        yzt1.height = scanner.nextDouble();
        System.out.println(yzt1);
    }
}