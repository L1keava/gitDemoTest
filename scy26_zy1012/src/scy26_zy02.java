import java.util.Scanner;
public class scy26_zy02 {
    public static void main(String[] args){
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        num = scanner.nextInt();
        if (num%2==0){
            System.out.println("你输入的数字是偶数");
        }else {
            System.out.println("你输入的数字是奇数");
        }
    }
}
