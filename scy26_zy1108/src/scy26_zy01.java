import java.util.Scanner;

public class scy26_zy01 {
    public static void main(String[] args) {
        double result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要托运行李的重量（单位：KG）：");
        double weight = scanner.nextDouble();
        if (weight > 20) {
            if (weight > 100) {
                result += (weight - 100) * 2 + 80 * 1.2; //超过100KG的部分   20KG免费 超过20的部分 1.2元
            } else {
                result += (weight - 20) * 1.2;
            }
        }
        System.out.println("需要的费用为：" + result);
    }
}