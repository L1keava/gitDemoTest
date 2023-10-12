import java.util.Scanner;
public class scy26_zy04 {
    public static void main(String[] args){
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        num = scanner.nextInt();
        if (num%3==0){
            if (num % 7 == 0) {
                System.out.println("你输入的数字是3的倍数，并且是7的倍数");
                return;
            }
            System.out.println("你输入的数字是3的倍数");
        } else if (num % 7 ==0) {
            System.out.println("你输入的数字是7的倍数");
        }else {
            System.out.println("你输入的数字不是3也不是7的倍数");
        }
    }
}
