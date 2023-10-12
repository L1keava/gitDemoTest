import  java.util.Scanner;
public class Scy26_zy04 {
    public static void main(String[] args){
        int a,b,temp;
        System.out.println("请输入需要交换的两个数字：");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b= scanner.nextInt();
        temp = a;
        a = b;
        b = temp;
        System.out.println("交换后的a:" + a);
        System.out.println("交换后的b:" + b);
    }
}
