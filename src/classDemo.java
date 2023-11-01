import java.util.Scanner;

class student {
    String name;
    String sex;
    int age;

    void read() {
        System.out.println("MY NAME IS " + getName());
        System.out.println("I AM A " + getSex());
        System.out.println("I AM " + getAge());
    }

    String getName() {
        return name;
    }

    String getSex() {
        return sex;
    }

    int getAge() {
        return age;
    }

    void setName(String str) {
        name = str;
    }

    void setSex(String str) {
        sex = str;
    }

    void setAge(int num) {
        if (age >= 0) {
            age = num;
        } else {
            System.out.println("错误年龄");
        }
    }

}

public class classDemo {
    public static void main(String[] args) {
        student student = new student();
        System.out.println("请输入你的姓名、性别、年纪：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String sex = scanner.nextLine();
        int age = scanner.nextInt();
        student.setName(name);
        student.setSex(sex);
        student.setAge(age);
        student.read();
    }
}
