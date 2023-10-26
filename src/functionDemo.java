import java.util.Scanner;

public class functionDemo {
    public static void main(String[] args) {
        //累加n个2
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" x = 2n+14");
        System.out.println("请输入n的值：");
        n = scanner.nextInt();
        System.out.println("x = " + function(n));
    }

    public static int function(int num) {
        int x;
        if (num == 1) {
            x = 16;
        } else {
            x = 2 + function(num - 1);
        }
        return x;
    }
}
