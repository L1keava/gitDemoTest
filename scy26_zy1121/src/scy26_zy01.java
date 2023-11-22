import java.util.Scanner;

class yuan{
    double r;
    double  mj(){
        return 3.14*r*r;
    }
    double zc(){
        return 2*3.14*r;
    }
    void get(){
        System.out.println("该圆形的半径为：" + r+" 面积为：" + mj() + " 周长为：" + zc());
    }

}
public class scy26_zy01 {
    public static void main(String[] args) {
        yuan yuan = new yuan();
        Scanner scanner =  new Scanner(System.in);
        yuan.r = scanner.nextDouble();
        yuan.get();
    }
}
