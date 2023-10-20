public class scy26_zy02 {
    public static void main(String[] args) {
        int num = 1, result = 0;
        while (num <= 101) {
            if (num % 4 == 1) {
                result += num;
                num += 2;
                continue;
            }
            result -= num;
            num += 2;
        }
        System.out.println("结果是：" + result);
    }
}