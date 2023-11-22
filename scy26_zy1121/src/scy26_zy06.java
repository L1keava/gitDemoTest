import java.util.Scanner;

class Person {
    String sex;
    private int age;

    public Person(String sex, int age) {
        this.sex = sex;
        this.age = age;
    }

    void get() {
        System.out.println("年龄：" + age + " 性别：" + sex);
    }
}

public class scy26_zy06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入性别 年龄：");
        Person person = new Person(scanner.next(), scanner.nextInt());
        person.get();
    }
}
