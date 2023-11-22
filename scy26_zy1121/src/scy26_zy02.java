import java.util.Scanner;

class yuanzhu{
    double r,h;
    double bArea(){
        return 3.14*r*r;
    }
    double tji(){
        return 3.14*r*r*h;
    }
    void get(){
        System.out.println("圆柱体的半径为:" + r + " 高为：" + h + " 底面积为："
                + bArea() + " 体积为：" + tji());
    }
}
public class scy26_zy02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        yuanzhu yz = new yuanzhu();
        System.out.println("请输入圆柱的半径和高：");
        yz.r = scanner.nextDouble();
        yz.h = scanner.nextDouble();
        yz.get();
    }
}
