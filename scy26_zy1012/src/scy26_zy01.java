import java.util.Scanner;
public class scy26_zy01 {
    public static void main(String[] args){
        int num1,num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个整数：");
        num1=scanner.nextInt();num2=scanner.nextInt();
        if (num1 > num2){
            System.out.println("最大数是：" + num1);
        }else {
            System.out.println("最大数是：" + num2);
        }
    }
}
