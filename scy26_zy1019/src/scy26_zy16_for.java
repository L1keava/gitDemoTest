public class scy26_zy16_for {
    public static void main(String[] args) {
        int num, sum = 0;
        for (num = 1; num <= 99; num++) {
            if (num % 2 == 1) {
                sum += num;
            }
        }
        System.out.println("结果是：" + sum);
    }
}