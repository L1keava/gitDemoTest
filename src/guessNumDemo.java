import java.util.*;

public class guessNumDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(11);
        for (int times = 1; times <= 3; times++) {
            System.out.println("请输入整数：");
            int in = scanner.nextInt();
            if (num < in) {
                System.out.println("猜大了");
            } else if (num > in) {
                System.out.println("猜小了");
            } else {
                System.out.println("猜对了！你用了 " + times + " 次机会");
            }
        }
    }
}