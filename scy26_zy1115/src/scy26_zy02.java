import java.util.Scanner;

class yz {
    private double r, h;

    void setR(double r) {
        this.r = r;
    }

    void setH(double h) {
        this.h = h;
    }

    double getR() {
        return r;
    }

    double getH() {
        return h;
    }

    double dmj() {
        return 3.14 * getR() * getR();
    }

    double tj() {
        return 3.14 * getR() * getR() * getH();
    }

    void printf() {
        System.out.println("半径为：" + getR() + ",高为：" + getH() + ",底面积为：" + dmj() + ",体积为：" + tj());
    }
}

public class scy26_zy02 {
    public static void main(String[] args) {
        yz yz1 = new yz();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入10组圆柱的半径和高：");
        for (int i = 0; i < 10; i++) {
            yz1.setR(scanner.nextDouble());
            yz1.setH(scanner.nextDouble());
            yz1.printf();
        }
    }
}
