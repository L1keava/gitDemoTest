public class scy26_zy06 {
    public static void main(String[] args){
        int num = 1, sum = 0;
        while (num <= 99) {
            if (num % 2 != 0) {
                sum += num;
                num++;
                continue;
            }
            num++;
        }
        System.out.println("1+3+5+...+99的结果为：" + sum);
    }
}
