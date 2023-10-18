import java.util.*;
public class guessNumDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(11);
        int times = 0;
        int input;
        ++times;
        System.out.println("请输入一个整数：");
        input = scanner.nextInt();
        if (input==num){
            System.out.println("恭喜，猜对了！");
            System.out.println("你用了 " + times + " 次机会");
        }else {
            if (input > num) {
                System.out.println("猜大了");
                ++times;
                System.out.println("请输入一个整数：");
                input = scanner.nextInt();
                if (input==num){
                    System.out.println("恭喜，猜对了！");
                    System.out.println("你用了 " + times + " 次机会");
                }else {
                    if (input > num) {
                        System.out.println("猜大了");
                        ++times;
                        System.out.println("请输入一个整数：");
                        input = scanner.nextInt();
                        if (input==num){
                            System.out.println("恭喜，猜对了！");
                            System.out.println("你用了 " + times + " 次机会");
                        }else {
                            System.out.println("三次机会用完");
                            System.out.println("正确答案是：" + num);
                        }
                    } else {
                        System.out.println("猜小了");
                        ++times;
                        System.out.println("请输入一个整数：");
                        input = scanner.nextInt();
                        if (input==num){
                            System.out.println("恭喜，猜对了！");
                            System.out.println("你用了 " + times + " 次机会");
                        }else {
                            if (input > num) {
                                System.out.println("猜大了");
                            } else {
                                System.out.println("猜小了");
                            }
                        }
                    }
                }
            } else {
                System.out.println("猜小了");
                ++times;
                System.out.println("请输入一个整数：");
                input = scanner.nextInt();
                if (input==num){
                    System.out.println("恭喜，猜对了！");
                    System.out.println("你用了 " + times + " 次机会");
                }else {
                    if (input > num) {
                        System.out.println("猜大了");
                        ++times;
                        System.out.println("请输入一个整数：");
                        input = scanner.nextInt();
                        if (input==num){
                            System.out.println("恭喜，猜对了！");
                            System.out.println("你用了 " + times + " 次机会");
                        }else {
                            System.out.println("三次机会用完");
                            System.out.println("正确答案是：" + num);
                        }
                    } else {
                        System.out.println("猜小了");
                        ++times;
                        System.out.println("请输入一个整数：");
                        input = scanner.nextInt();
                        if (input==num){
                            System.out.println("恭喜，猜对了！");
                            System.out.println("你用了 " + times + " 次机会");
                        }else {
                            System.out.println("三次机会用完");
                            System.out.println("正确答案是：" + num);
                        }
                    }
                }
            }
        }
    }
}


