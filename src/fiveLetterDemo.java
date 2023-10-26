import java.io.IOException;

public class fiveLetterDemo {
    public static void main(String[] args) throws IOException {
        char chr;
        System.out.println("请输入一个字母：");
        chr = (char) System.in.read();
        switch (chr) {
            case 65, 69, 73, 79, 85, 97, 101, 105, 111, 117:
                System.out.println("你输入了一个元音字母");
                break;
            default:
                System.out.println("你输入了一个非元音字母的字符");
        }
    }
}
