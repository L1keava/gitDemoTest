import java.util.Scanner;

public class scy26_zy05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个成绩：");
        float score = scanner.nextFloat();
        getGrade(score);
    }

    public static void getGrade(float score) {
        switch ((int) score / 10) {
            case 9:
                System.out.println("优");
                break;
            case 8:
                System.out.println("良");
                break;
            case 7:
                System.out.println("中");
                break;
            case 6:
                System.out.println("及格");
                break;
            default:
                System.out.println("不及格");
        }
    }
}