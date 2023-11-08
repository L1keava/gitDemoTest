import java.util.Scanner;

public class scy26_zy04 {
    public static void main(String[] args) {
        boolean flag = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入日期：");
        int date = scanner.nextInt();
        int years = date / 100;
        int month = date % 100;
        if (years % 100 == 0 && years % 400 == 0) {
            flag = true;
        } else if (years % 4 == 0 && years % 100 != 0) {
            flag = true;
        }
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println(years + " 年 " + month + " 月有 " + 31 + " 天");
                break;
            case 2:
                if (flag) {
                    System.out.println(years + " 年 " + month + " 月有 " + 29 + " 天");
                } else {
                    System.out.println(years + " 年 " + month + " 月有 " + 28 + " 天");
                }
                break;
            case 4, 6, 9, 11:
                System.out.println(years + " 年 " + month + " 月有 " + 30 + " 天");
                break;
            default:
                System.out.println("请输入正确的月份：");
        }
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println(years + " 年 " + month + " 月有 " + 31 + " 天");
        } else if (month == 2) {
            if (flag) {
                System.out.println(years + " 年 " + month + " 月有 " + 29 + " 天");
            } else {
                System.out.println(years + " 年 " + month + " 月有 " + 28 + " 天");
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println(years + " 年 " + month + " 月有 " + 30 + " 天");
        }
    }
}
