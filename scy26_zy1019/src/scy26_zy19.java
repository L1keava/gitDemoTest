public class scy26_zy19 {
    public static void main(String[] args) {
        int num, sum = 0;
        for (num = 1; num <= 101; num++) {
            if (num % 2 == 1) {
                if (num % 4 == 1) {
                    sum += num;
                } else {
                    sum -= num;
                }
            }
        }
        System.out.println("结果是：" + sum);
    }
}