import java.util.Scanner;

public class scy26_zy02 {
    public static void main(String[] args) {
        boolean flag = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份：");
        int years = scanner.nextInt();
        if (years % 100 == 0 && years % 400 == 0) {
            flag = true;
        } else if (years % 4 == 0 && years % 100 != 0) {
            flag = true;
        }
        if (flag) {
            System.out.println(years + "是闰年");
        } else {
            System.out.println(years + "不是闰年");
        }
    }
}