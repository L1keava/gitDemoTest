import java.util.Scanner;

class cfx {
    double length, width;

    public cfx() {
    }

    public cfx(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double getArea() {
        return length * width;
    }

    void print() {
        System.out.println("长方形的长为：" + length + " 宽为：" + width + " 面积为：" + getArea());
    }
}

class cft extends cfx {
    public cft() {
    }

    public cft(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double length, width, height;

    double getTj() {
        return length * width * height;
    }

    @Override
    public String toString() {
        return "长方体的长为：" + length + " 宽为：" + width + "高为：" + width
                + " 体积为：" + getTj();
    }
}

public class scy26_zy04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入长方形的长和宽：");
        cfx cfx1 = new cfx(scanner.nextDouble(), scanner.nextDouble());
        cfx1.print();
        System.out.println("请输入长方体的长 宽 高：");
        cft cft1 = new cft(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        System.out.println(cft1);
    }
}
