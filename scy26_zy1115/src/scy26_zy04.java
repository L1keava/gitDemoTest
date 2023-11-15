import java.util.Scanner;

class student {
    String bj, xh, xm, xb;
    double age, gs, yy, java, ty;

    void printf() {
        System.out.println("班级：" + bj + " 学号：" + xh + " 年龄：" + age + " 姓名：" + xm + " 性别：" + xb + " 高数成绩：" + gs
                + " 英语成绩：" + yy + " Java成绩：" + java + " 体育成绩：" + ty);
    }

    void sum() {
        System.out.print("  " +xm + " 的总分为：" + (int) (gs + yy + java + ty));
    }

    void average() {
        System.out.print("  " +xm + " 的平均成绩为：" + (int) (gs + yy + java + ty) / 4);
    }

    void maxScore() {
        System.out.print("  " +xm + " 四科成绩中最高分为：" + scy26_zy04.getMax(scy26_zy04.getMax(gs, yy), scy26_zy04.getMax(java, ty)));
    }

    void minScore() {
        System.out.print("  " +xm + " 四科成绩中最低分为:" + scy26_zy04.getMin(scy26_zy04.getMin(gs, yy), scy26_zy04.getMin(java, ty)));
    }
}

public class scy26_zy04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        student stu = new student();
        System.out.println("请依次输入10组以下数据：");
        System.out.println("班级 学号 年龄 姓名 性别 高数成绩 英语成绩 Java成绩 体育成绩：");
        for (int i = 0; i < 10; i++) {
            stu.bj = scanner.next();
            stu.xh = scanner.next();
            stu.age = scanner.nextDouble();
            stu.xm = scanner.next();
            stu.xb = scanner.next();
            stu.gs = scanner.nextDouble();
            stu.yy = scanner.nextDouble();
            stu.java = scanner.nextDouble();
            stu.ty = scanner.nextDouble();
            stu.printf();
            stu.sum();
            stu.average();
            stu.maxScore();
            stu.minScore();
            System.out.println();
        }
    }

    static double getMax(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    static double getMin(double num1, double num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }
}
