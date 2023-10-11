
import  java.util.Scanner;
public class Scy26_zy05 {
    public static void main(String[] args){
        double banjing,zhouchang,mianji;
        System.out.println("请输入圆的半径：");
        Scanner scanner = new Scanner(System.in);
        banjing = scanner.nextDouble();
        zhouchang = 2*Math.PI*banjing;
        mianji = Math.PI * banjing * banjing;
        System.out.println("圆的周长为：" + zhouchang);
        System.out.println("圆的面积为：" + mianji);
        }
    }

