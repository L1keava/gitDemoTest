import java.util.Scanner;

class sanjiaoxing {
    private double a, b, c;

    public sanjiaoxing(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double getA() {
        return a;
    }

    double getB() {
        return b;
    }


    double getC() {
        return c;
    }

    double mj() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    double zc() {
        return getC() + getB() + getA();
    }

    void get() {
        System.out.println("三角形的边为：" + getA() + " " + getB() + " " + getC()
                + " 面积为：" + mj() + " 周长为：" + zc());
    }

}

public class scy26_zy05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        sanjiaoxing sjx = new sanjiaoxing(scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble());
        System.out.println("请输入三角形三条边：");
        sjx.get();
    }
}
