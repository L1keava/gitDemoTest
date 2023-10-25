public class scy26_zy11 {
    public static void main(String[] args) {
        boolean flag;
        for (int num = 2; num <= 100; num++) {
            flag = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(num + "  ");
            }
        }
    }
}
