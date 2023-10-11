import java.util.Scanner;
public class Scy26_zy02 {
    public static void main (String[] args){
        int input,ge,shi,bai,qian;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入四位数字：");
        input = scanner.nextInt();
        ge = input %10;
        shi = input / 10 % 10;
        bai = input / 100 % 10;
        qian  = input / 1000;
        System.out.println("个位是："+ge);
        System.out.println("十位是："+shi);
        System.out.println("百位是："+bai);
        System.out.println("千位是："+qian);
    }
}