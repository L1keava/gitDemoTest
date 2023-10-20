public class scy26_zy13_for {
    public static void main(String[] args) {
        int sum = 0, num;
        for (num = 1; num <= 100; ++num) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        System.out.println("结果是：" + sum);
    }
}
