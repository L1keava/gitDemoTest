import java.util.Scanner;

class yz {
    double r, h;

    double dmj() {
        return 3.14 * r * r;
    }

    double tj() {
        return 3.14 * r * r * h;
    }

    void printf() {
        System.out.println("半径为：" + r + ",高为：" + h + ",底面积为：" + dmj() + ",体积为：" + tj());
    }
}

public class scy26_zy02 {
    public static void main(String[] args) {
        yz yz1 = new yz();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入10组圆柱的半径和高：");
        for (int i = 0; i < 10; i++) {
            yz1.r = scanner.nextDouble();
            yz1.h = scanner.nextDouble();
            yz1.printf();
        }
    }
}
