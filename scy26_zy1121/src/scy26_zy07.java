import java.util.Scanner;

class book {
    protected String name, id, press, price;

    public book(String name, String id, String press, String price) {
        this.name = name;
        this.id = id;
        this.press = press;
        this.price = price;
    }

    void get() {
        System.out.println("书名：" + name + " 书号：" + id + " 出版社：" + press + " 价格：" + price);
    }

}

public class scy26_zy07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入书名 书号 出版社 价格：");
        book book = new book(scanner.next(), scanner.next(), scanner.next(), scanner.next());
        book.get();
    }
}
