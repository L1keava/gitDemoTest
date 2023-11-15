import java.util.Scanner;

class cfx {
    double length, width;

    double area() {
        return length * width;
    }

    double zc() {
        return length * 2 + width * 2;
    }

    void printf() {
        System.out.println("长方形的长为：" + length + ",长方形的宽为：" + width + ",长方形的面积为：" + area() + ",长方形的周长为：" + zc());
    }
}

public class scy26_zy03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        cfx c1 = new cfx();
        System.out.println("请输入10组长方形的长和宽：");
        for (int i = 0; i < 10; i++) {
            c1.length = scanner.nextDouble();
            c1.width = scanner.nextDouble();
            c1.printf();
        }
    }
}
