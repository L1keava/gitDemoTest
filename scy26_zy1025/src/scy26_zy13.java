public class scy26_zy13 {
    public static void main(String[] args) {
        int sum = 0;
        for (int round = 1; round <= 10; round++) {
            int result = 1;
            for (int i = 1; i <= round; i++) {
                result = result * i;
            }
            sum += result;
        }
        System.out.println("结果为：" + sum);
    }
}
