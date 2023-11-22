import java.util.Scanner;

class student {
    private String bj, xh, xm, xb;
    private double age, gs, yy, java, ty;

    void printf() {
        System.out.println("班级：" + getBj() + " 学号：" + getXh() + " 年龄：" + getAge() + " 姓名：" + getXm() + " 性别：" + getXb() + " 高数成绩：" + getGs()
                + " 英语成绩：" + getYy() + " Java成绩：" + getJava() + " 体育成绩：" + getYy());
    }

    void sum() {
        System.out.print("  " + getXm() + " 的总分为：" + (getGs() + getYy() + getJava() + getTy()));
    }

    void average() {
        System.out.print("  " + getXm() + " 的平均成绩为：" + (getGs() + getYy() + getJava() + getTy()) / 4);
    }

    double getMax(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    double getMin(double num1, double num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }

    void maxScore() {
        System.out.print("  " + getXm() + " 四科成绩中最高分为：" + getMax(getMax(getGs(), getYy()), getMax(getJava(), getTy())));
    }

    void minScore() {
        System.out.print("  " + getXm() + " 四科成绩中最低分为:" + getMin(getMin(getGs(), getYy()), getMin(getJava(), getTy())));
    }

    void setBj(String bj) {
        this.bj = bj;
    }

    String getBj() {
        return this.bj;
    }

    void setXh(String xh) {
        this.xh = xh;
    }

    String getXh() {
        return this.xh;
    }

    void setXm(String xm) {
        this.xm = xm;
    }

    String getXm() {
        return this.xm;
    }

    void setXb(String xb) {
        this.xb = xb;
    }

    String getXb() {
        return this.xb;
    }

    void setAge(double age) {
        if (age < 0 || age > 200) {
            System.out.println("年龄输入有误");
        } else {
            this.age = age;
        }
    }

    double getAge() {
        return this.age;
    }

    void setGs(double gs) {
        if (gs < 0 || gs > 100) {
            System.out.println("高数成绩输入有误");
        } else {
            this.gs = gs;
        }
    }

    double getGs() {
        return this.gs;
    }

    void setYy(double yy) {
        if (yy < 0 || yy > 100) {
            System.out.println("英语成绩输入有误");
        } else {
            this.yy = yy;
        }
    }

    double getYy() {
        return this.yy;
    }

    void setJava(double java) {
        if (java < 0 || java > 100) {
            System.out.println("Java成绩输入有误");
        } else {
            this.java = java;
        }
    }

    double getJava() {
        return this.java;
    }

    void setTy(double ty) {
        if (ty < 0 || ty > 100) {
            System.out.println("体育成绩输入有误");
        } else {
            this.ty = ty;
        }
    }

    double getTy() {
        return this.ty;
    }
}

public class scy26_zy04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        student stu = new student();
        System.out.println("请依次输入10组以下数据：");
        System.out.println("班级 学号 年龄 姓名 性别 高数成绩 英语成绩 Java成绩 体育成绩：");
        for (int i = 0; i < 10; i++) {
            stu.setBj(scanner.next());
            stu.setXh(scanner.next());
            stu.setAge(scanner.nextDouble());
            stu.setXm(scanner.next());
            stu.setXb(scanner.next());
            stu.setGs(scanner.nextDouble());
            stu.setYy(scanner.nextDouble());
            stu.setJava(scanner.nextDouble());
            stu.setTy(scanner.nextDouble());
            stu.printf();
            stu.sum();
            stu.average();
            stu.maxScore();
            stu.minScore();
            System.out.println();
        }
    }

}
