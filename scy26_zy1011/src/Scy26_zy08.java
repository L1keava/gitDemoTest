import java.io.IOException;

public class Scy26_zy08 {
    public static void main(String[] args) throws IOException {
        char input1,input2,output1,output2;
        System.out.println("请输入两个小写字符：");
        input1 = (char) (System.in.read());
        input2 = (char) (System.in.read());
        System.out.println("第一个小写字母：" + input1);
        System.out.println("第二个小写字母：" + input2);
        output1 = (char) (input1 - 32);
        output2 = (char) (input2 - 32);
        System.out.println("转换后的大写字母为：" + output1 + "," + output2);
    }
}
