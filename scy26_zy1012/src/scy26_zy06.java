import java.io.IOException;

public class scy26_zy06 {
    public static void main(String[] args) throws IOException {
        char letter;
        System.out.println("请输入一个字母：");
        letter = (char) System.in.read();
        if (letter  >= 97 && letter <= 122){
            System.out.println((char) (letter-32));
        }else{
            System.out.print( letter);
        }

    }
}
