public class scy26_zy05 {
    public static void main(String[] args) {
        int num = 1, sum = 0;
        while (num <= 100) {
            if (num % 2 == 0) {
                sum += num;
                num++;
                continue;
            }
            num++;
        }
        System.out.println("2+4+6+...+100的结果为：" + sum);
    }
}
