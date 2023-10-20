public class scy26_zy17 {
    public static void main(String[] args) {
        double num, sum = 0, result = 1;
        for (num = 1; num <= 10; num++) {
            result *= num;
            sum += 1 / num;
        }
        for (double i = 1; i <= 100; i++) {
            result += i;
        }
        System.out.println("结果是：" + (sum + result));
    }
}