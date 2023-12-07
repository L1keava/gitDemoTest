/*默认构造方法解释：
Animals类使用了构造方法进行赋值
Dog类继承自Animals类
如果Animals类构造方法不存在时
JDK在编译时会自动生成空构造方法
但是当有参构造方法存在的时候
则不会自动生成无参构造方法
此时Dog类在继承Animals类的时候需要一个空构造方法
因此需要在父类 即Animals类中加入构造方法：
Animals() {
}
 */
class Animals {
    Animals() {
    }

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String name;
    int age;

    void say() {
        System.out.println("我是 " + age + "岁的 " + name);
        System.out.println("喵喵...");
    }
}

class Dog extends Animals {
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void say() {
        System.out.println("我是 " + age + "岁的 " + name);
        System.out.println("汪汪...");
    }
}

public class constructorDemo {
    public static void main(String[] args) {
        Animals animals = new Animals("小猫", 5);
        Dog dog = new Dog("小狗", 4);
        animals.say();
        dog.say();
    }
}
