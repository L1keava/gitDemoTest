public class scy26_zy13_doWhile {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        do {
            sum += num;
            num += 2;
        } while (num <= 100);
        System.out.println("结果是：" + sum);
    }
}