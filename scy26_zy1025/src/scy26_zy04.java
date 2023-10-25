import java.io.IOException;

public class scy26_zy04 {
    public static void main(String[] args) throws IOException {
        char chr;
        System.out.println("请输入一个小写字母：");
        chr = (char) System.in.read();
        switch (chr) {
            case 97, 101, 105, 111, 117:
                System.out.println("你输入了一个元音字母");
                break;
            default:
                System.out.println("你输入了一个非元音字母的字符");
        }
    }
}