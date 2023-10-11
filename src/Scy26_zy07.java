import java.util.Scanner;
public class Scy26_zy07 {
    public static void main(String[] args){
        double a,b,c,zc,s,mj;
        System.out.println("请输入三角形三个边：");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        zc = a+b+c;
        s=(a+b+c)/2;
        mj = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("三角形的周长是："+ zc);
        System.out.println("三角形的面积是：" + mj);
    }
}
