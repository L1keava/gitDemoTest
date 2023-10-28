public class multiplyDemo {
    public static void main(String[] args) {
        System.out.println("结果为：" + multiply(10));
    }

    public static int multiply(int sum) {
        if (sum - 1 != 0) {
            return sum * multiply(sum - 1);
        } else {
            return sum;
        }
    }
}