import java.util.Scanner;

public class scy26_zy03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入日期：");
        int input = scanner.nextInt();
        int month = input / 100;
        int day = input % 100;
        if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            System.out.println("水瓶座");
        } else if (month == 2 || month == 3 && day <= 20) {
            System.out.println("双鱼座");
        } else if (month == 3 || month == 4 && day <= 19) {
            System.out.println("白羊座");
        } else if (month == 4 || month == 5 && day <= 20) {
            System.out.println("金牛座");
        } else if (month == 5 || month == 6 && day <= 21) {
            System.out.println("双子座");
        } else if (month == 6 || month == 7 && day <= 22) {
            System.out.println("巨蟹座");
        } else if (month == 7 || month == 8 && day <= 22) {
            System.out.println("狮子座");
        } else if (month == 8 || month == 9 && day <= 22) {
            System.out.println("处女座");
        } else if (month == 9 || month == 10 && day <= 23) {
            System.out.println("天秤座");
        } else if (month == 10 || month == 11 && day <= 22) {
            System.out.println("天蝎座");
        } else if (month == 11 || month == 12 && day <= 21) {
            System.out.println("射手座");
        } else if (month == 12 || month == 1) {
            System.out.println("摩羯座");
        }
    }
}
