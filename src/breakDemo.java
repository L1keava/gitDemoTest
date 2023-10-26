public class breakDemo {
    public static void main(String[] args) {
        for (int i = 2; i <= 200; i++) {
            boolean flag = true;
            for (int k = 2; k <= i - 1; k++) {
                if (i % k == 0) {
                    flag = false;
                    break;
                    /*
                    此题要求 求2到200之间的素数
                    此处break的作用是 直接终止这一层for循环
                    原因是如果此处条件成了 那么i一定不为素数
                    再继续判断接下来的条件无意义 可以提前退出
                     */
                }
            }
            if (flag) {
                System.out.println(i + "是素数");
            }

        }
    }
}
