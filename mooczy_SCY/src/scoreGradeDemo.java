import java.util.Scanner;

public class scoreGradeDemo {
    public static void main(String [] args){
        float score;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入成绩：");
        score=scanner.nextFloat();
        if (score >= 90){
            System.out.println("优秀");
        } else if (score >= 80) {
            System.out.println("良好");
        } else if (score >= 60) {
            System.out.println("中");
        }else {
            System.out.println("差");
        }
    }
}
