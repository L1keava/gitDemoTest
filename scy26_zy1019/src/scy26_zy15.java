public class scy26_zy15 {
    public static void main(String[] args) {
        int num, result = 0;
        for (num = 1; num <= 100; num++) {
            if (num % 3 == 0 || num % 7 == 0) {
                result += num;
            }
        }
        System.out.println("结果是：" + result);
    }
}
