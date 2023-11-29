import java.util.Scanner;

class cfx {
    double length, width;

    public cfx() {
    }


    double getArea() {
        return length * width;
    }

    double getZc() {
        return (length + width) * 2;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    double getLength() {
        return length;
    }

    double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "长方形的长：" + getLength() + "宽：" + getWidth()
                + "面积：" + getArea() + "周长：" + getZc();
    }
}

class cft extends cfx {
    double height;

    double getHeight() {
        return height;
    }

    void setHeight(double height) {
        this.height = height;
    }

    double getTj() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "长方体的长：" + getLength() + " 宽：" + getWidth() + " 高："
                + getHeight() + " 底面积：" + getArea() + " 体积：" + getTj();
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
        cft cft1 = new cft();
        System.out.println("请输入长方体的长和宽：");
        cft1.setLength(scanner.nextDouble());
        cft1.setWidth(scanner.nextDouble());
        System.out.println("请输入长方体的高：");
        cft1.setHeight(scanner.nextDouble());
        System.out.println(cft1);
    }
}
