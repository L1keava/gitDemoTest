public class scy26_zy03 {
    public static void main(String[] args) {
        double num = 1, result = 1, sum = 0;
        while (num <= 10) {
            result *= num;
            sum += 1 / num;
            num++;
        }
        result += sum;
        num = 1;
        while (num <= 100) {
            result += num;
            num++;
        }
        System.out.println("1+2+3+..+100+1*2*3*..*10+1+1/2+1/3+1/4+..+1/10的结果是：" + result);
    }
}