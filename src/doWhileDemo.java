public class doWhileDemo {
    public static void main(String[] args) {
        int num = 1, result = 0;
        while (num <= 100) {
            if (num % 7 == 0 || num % 3 == 0) {
                num++;
                continue;
            }
            result += num;
            num++;
        }
        System.out.println(result);
    }
}
