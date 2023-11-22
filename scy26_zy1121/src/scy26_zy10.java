import java.util.Scanner;

class Teacher {
    private String unit, id, name, sex;
    private double jbgz, jj, gjj, yb;

    public Teacher(String unit, String id, String name, String sex, double jbgz, double jj, double gjj, double yb) {
        this.unit = unit;
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.jbgz = jbgz;
        this.jj = jj;
        this.gjj = gjj;
        this.yb = yb;
    }

    void get() {
        System.out.println("单位名称：" + unit + " 教工号：" + id + " 姓名：" + name + " 性别：" + sex + "\n基本工资：" + jbgz + " 奖金：" + jj + " 公积金：" + gjj + " 医保：" + yb);
    }

    double salary() {
        return jbgz + jj - gjj - yb;
    }
}

public class scy26_zy10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：单位名称、教工号、姓名、性别，基本工资、奖金、公积金、医保");
        Teacher teacher = new Teacher(scanner.next(), scanner.next(), scanner.next(), scanner.next(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        teacher.get();
        System.out.println("实发工资为：" + teacher.salary());
    }
}
