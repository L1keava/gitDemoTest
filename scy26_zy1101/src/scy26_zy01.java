import java.io.IOException;

public class scy26_zy01 {
    public static void main(String[] args) throws IOException {
        char[] array = new char[10];
        System.out.println("请输入10个字符：");
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) System.in.read();
        }
        System.out.println("转换后：");
        for (int i = 0; i < array.length; ++i)
            if (array[i] >= 'a' && array[i] <= 'z') {
                array[i] -= 32;
            } else if (array[i] >= 'A' && array[i] <= 'Z') {
                array[i] += 32;
            }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
