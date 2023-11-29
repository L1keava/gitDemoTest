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
        return this.length * this.width;
    }

    double getZc() {
        return (this.length + this.width) * 2;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    double getLength() {
        return this.length;
    }

    double getWidth() {
        return this.width;
    }

    @Override
    public String toString() {
        return "长方形的长：" + length + "宽：" + width
                + "面积：" + getArea() + "周长：" + getZc();
    }
}

class cft extends cfx {
    double height;

    double getTj() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "长方体的长：" + getLength() + " 宽：" + getWidth() + " 高："
                + height + " 底面积：" + super.getArea() + " 体积：" + getTj();
    }
}

public class extendsClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入长方形的长和宽：");
        cfx cfx1 = new cfx();
        cfx1.setLength(scanner.nextDouble());
        cfx1.setWidth(scanner.nextDouble());
        System.out.println(cfx1);
        System.out.println("请输入长方体的高：");
        cft cft1 = new cft();
        cft1.height = scanner.nextDouble();
        System.out.println(cft1);
    }
}
