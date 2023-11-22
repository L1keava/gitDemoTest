import java.util.Scanner;

    class changfangxing{
        double length,width;
        double mj(){
            return length*width;
    }
    double zc(){
        return (length+width) * 2;
    }
    void get(){
        System.out.println("长方形的长：" + length + " 宽：" +width + " 面积："
        + mj() + " 周长：" + zc());
    }
}
public class scy26_zy03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入长方形的长和宽：");
        changfangxing cfx = new changfangxing();
        cfx.length = scanner.nextDouble();
        cfx.width = scanner.nextDouble();
        cfx.get();
    }
}
