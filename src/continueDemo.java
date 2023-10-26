public class continueDemo {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                continue;
                    /*
                    此题要求：
                    求1到100之间偶数和
                    此处continue作用为进入下一次for循环
                    如果不能被2整除 则该数为奇数
                    应进入下一次循环 否则将执行累加语句
                     */
            }
            num += i;
        }
        System.out.println(num);
    }
}
