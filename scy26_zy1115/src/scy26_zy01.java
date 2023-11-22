import java.util.Scanner;

class yuan {
    private double r;

    void setR(double r){
        this.r = r;
    }

    double getR(){
        return r;
    }
    double area() {
        return 3.14 * getR() * getR();
    }

    double zc() {
        return 2 * 3.14 * getR();
    }

    void printf() {
        System.out.println("半径为：" + getR() + ",面积为：" + area() + ",周长为：" + zc());
    }
}

public class scy26_zy01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        yuan y1 = new yuan();
        System.out.println("请输入10个圆的半径：");
        for (int i = 0; i < 10; i++) {
            y1.setR(scanner.nextDouble());
            y1.printf();
        }
    }
}
