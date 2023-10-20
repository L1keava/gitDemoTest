public class scy26_zy04 {
    public static void main(String[] args) {
        int num = 1, sum = 0;
        while (num <= 100) {
            if (num % 3 == 0 || num % 7 == 0) {
                sum += num;
                num++;
                continue;
            }
            num++;
        }
        System.out.println("100以内能被3或7整除的数的和为：" + sum);
    }
}