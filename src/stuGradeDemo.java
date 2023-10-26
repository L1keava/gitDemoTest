import java.util.*;

public class stuGradeDemo {
    public static void main(String[] args) {
        int students, average, bad = 0, total = 0;
        int[] score;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入班级人数：");
        students = scanner.nextInt();
        score = new int[students];
        for (int i = 0; i < students; i++) {
            score[i] = random.nextInt(101);
            total = total + score[i];
            if (score[i] < 60) {
                bad++;
            }
        }
        System.out.println("\n" + "排序前的Java成绩：");
        for (int i = 0; i < students; i++) {
            System.out.print(score[i] + " ");
        }
        average = total / students;
        for (int round = 0; round < students; round++) {
            for (int k = round; k < students; k++) {
                if (score[round] < score[k]) {
                    int temp = score[round];
                    score[round] = score[k];
                    score[k] = temp;
                }
            }
        }
        System.out.println("\n" + "降序排序后的Java成绩：");
        for (int i = 0; i < students; i++) {
            System.out.print(score[i] + " ");
        }
        System.out.println("\n" + "总成绩为：" + total + "\n" + "平均分为：" + average + "\n" + "不及格人数：" + bad);
    }
}
