public class scy26_zy07 {
    public static void main(String[] args) {
        double num = 1, sum = 0;
        while (num <= 10) {
            sum += 1 / num;
            num++;
        }
        System.out.println("1+1/2+1/3+...+1/10的结果为：" + sum);
    }
}