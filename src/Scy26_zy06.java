import  java.util.Scanner;
public class Scy26_zy06 {
    public static void main(String[] args){
        double chang,kuan,zc,mj;
        System.out.println("请输入长和宽：");
        Scanner scanner = new Scanner(System.in);
        chang = scanner.nextDouble();
        kuan = scanner.nextDouble();
        zc = (chang+kuan)*2;
        mj = chang*kuan;
        System.out.println("周长为：" + zc);
        System.out.println("面积为：" + mj);

    }
}
