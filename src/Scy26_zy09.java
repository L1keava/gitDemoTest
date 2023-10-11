import java.io.IOException;

public class Scy26_zy09 {
    public static void main (String[] args) throws IOException {
        char a;
        a= (char) System.in.read();
        System.out.println("输入的字符"+a);
        System.out.println("转换后："+ (char)(a - 32));
    }

}
