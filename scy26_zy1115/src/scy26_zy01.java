import java.util.Scanner;

class yuan {
    double r;

    double area() {
        return 3.14 * r * r;
    }

    double zc() {
        return 2 * 3.14 * r;
    }

    void printf() {
        System.out.println("半径为：" + r + ",面积为：" + area() + ",周长为：" + zc());
    }
}

public class scy26_zy01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        yuan y1 = new yuan();
        System.out.println("请输入10个圆的半径：");
        for (int i = 0; i < 10; i++) {
            y1.r = scanner.nextDouble();
            y1.printf();
        }
    }
}
