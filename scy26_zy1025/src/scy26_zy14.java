public class scy26_zy14 {
    public static void main(String[] args) {
        double result = 0;
        double num = 1;
        for (int i = 1; i <= 50; i++) {
            if (num % 4 == 3) {
                result = result - 1 / num;
            } else {
                result = result + 1 / num;
            }
            num += 2;
        }
        System.out.println("结果为：    " + result * 4);
    }
}
