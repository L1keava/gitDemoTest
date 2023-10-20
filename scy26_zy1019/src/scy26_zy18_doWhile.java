public class scy26_zy18_doWhile {
    public static void main(String[] args) {
        double num = 1, sum = 0;
        do {
            sum += 1 / num;
            num++;
        } while (num <= 10);
        System.out.println("结果是：" + sum);
    }
}
