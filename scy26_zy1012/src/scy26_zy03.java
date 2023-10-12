import java.util.Scanner;
public class scy26_zy03 {
    public static void main(String[] args){
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        num = scanner.nextInt();
        if (num%3 == 0){
            System.out.println("你输入的数字是3的倍数");
        }else {
            System.out.println("你输入的数字不是3的倍数");
        }
    }
}
