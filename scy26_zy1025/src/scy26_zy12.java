public class scy26_zy12 {
    public static void main(String[] args) {
        for (int num = 2; num <= 200; num++) {
            int sum = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}