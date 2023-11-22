import java.util.Scanner;

class student {
    private String bj, xh, xm, xb;
    private double age, gs, yy, java, ty;

    public void setBj(String bj) {
        this.bj = bj;
    }

    public void setGs(double gs) {
        if (gs >= 0 && gs < 100) {
            this.gs = gs;
        } else {
            System.out.println("高数成绩输入有误");
        }
    }

    public void setJava(double java) {
        if (java >= 0 && java < 100) {
            this.java = java;
        } else {
            System.out.println("Java成绩输入有误");
        }
    }

    public void setYy(double yy) {
        if (yy >= 0 & yy < 100) {
            this.yy = yy;
        } else {
            System.out.println("英语成绩输入有误");
        }
    }

    public void setTy(double ty) {
        if (ty >= 0 & ty < 100) {
            this.ty = ty;
        } else {
            System.out.println("体育成绩输入有误");
        }
    }

    public void setXb(String xb) {
        this.xb = xb;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getGs() {
        return gs;
    }

    public double getJava() {
        return java;
    }

    public double getTy() {
        return ty;
    }

    public double getYy() {
        return yy;
    }

    public String getBj() {
        return bj;
    }

    public String getXb() {
        return xb;
    }

    public String getXh() {
        return xh;
    }

    public String getXm() {
        return xm;
    }

    public double getAge() {
        return age;
    }

    public void get() {
        System.out.println("班级：" + getBj() + " 学号：" + getXh() + " 年龄：" + getAge() + " 姓名："
                + getXm() + " 性别：" + getXb() + " 高数成绩：" + getGs() + " 英语成绩：" + getYy() + " Java成绩：" + getJava()
                + " 体育成绩：" + getTy());
    }

    public double getSum() {
        return getGs() + getYy() + getTy() + getJava();
    }

    public double getAvg() {
        return getSum() / 4;
    }

    public double getMax(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public double getMin(double num1, double num2) {
        if (num1 > num2) {
            return num2;
        } else {
            return num1;
        }
    }
}

public class scy26_zy09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        student student = new student();
        System.out.println("请输入 班级 学号 年龄 姓名 性别 高数成绩 英语成绩 Java成绩 体育成绩：");
        student.setBj(scanner.next());
        student.setXh(scanner.next());
        student.setAge(scanner.nextDouble());
        student.setXm(scanner.next());
        student.setXb(scanner.next());
        student.setGs(scanner.nextDouble());
        student.setYy(scanner.nextDouble());
        student.setJava(scanner.nextDouble());
        student.setTy(scanner.nextDouble());
        student.get();
        System.out.println("总分为：" + student.getSum());
        System.out.println("平均分为：" + student.getAvg());
        System.out.println("最高分为：" + student.getMax(student.getMax(student.getGs(), student.getTy()), student.getMax(student.getYy(), student.getJava())));
        System.out.println("最低分为：" + student.getMin(student.getMin(student.getGs(), student.getTy()), student.getMin(student.getYy(), student.getJava())));
    }
}