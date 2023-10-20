public class scy26_zy16_doWhile {
    public static void main(String[] args) {
        int num = 1, sum = 0;
        do {
            sum += num;
            num += 2;
        } while (num <= 99);
        System.out.println("结果是：" + sum);
    }
}