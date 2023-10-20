public class scy26_zy14_doWhile {
    public static void main(String[] args) {
        int num = 1, result = 1;
        do {
            result *= num;
            num++;
        } while (num <= 10);
        System.out.println("结果是：" + result);
    }
}
