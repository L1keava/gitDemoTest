import java.util.Scanner;

class shape2 {
    double r, h, length, width, height;

    public shape2(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public shape2(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double getTj(double r, double h) {
        return 3.14 * r * r * h;
    }

    double getTj(double length, double width, double height) {
        return length * width * height;
    }

    public double getR() {
        return r;
    }

    public double getH() {
        return h;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    void print(double r, double h) {
        System.out.println("圆柱体的半径为：" + r + " 高为：" + h
                + " 体积为：" + getTj(r, h));
    }

    void print(double length, double width, double height) {
        System.out.println("长方体的长为：" + length + " 宽为：" + width
                + " 高为：" + height + " 体积为：" + getTj(length, width, height));
    }
}

public class scy26_zy02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入圆柱体的半径和高：");
        shape2 yz = new shape2(scanner.nextDouble(), scanner.nextDouble());
        yz.print(yz.getR(), yz.getH());
        System.out.println("请输入长方体的长 宽 高：");
        shape2 cft = new shape2(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        cft.print(cft.getLength(), cft.getWidth(), cft.getHeight());
    }
}