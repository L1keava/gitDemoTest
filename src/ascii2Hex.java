import java.util.InputMismatchException;
import java.util.Scanner;
public class ascii2Hex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Runtime runtime = Runtime.getRuntime();
        System.out.println("1、Ascii转Hex\n2、Hex转Ascii\n3、清理内存");
        do {
            try {
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        //Ascii to Hex here...
                        System.out.println("请输入Ascii字符串：");
                        System.out.println("转换完成，结果为：" + asc2hex.asc2hex(scanner.next()));
                        break;
                    case 2:
                        //Hex to Ascii here...
                        System.out.println("请输入Hex：");
                        System.out.println("转换完成，结果为：" + asc2hex.hex2asc(scanner.next()));
                        break;
                    case 3:
                        //garbage collection test
                        int old = (int) (runtime.freeMemory() / 1024 / 1024);
                        System.gc();
                        System.out.println("清理了 " + (old - (runtime.freeMemory() / 1024 / 1024)) + " MB 内存");
                        break;
                    default:
                        //Non 1-2
                        System.out.println("选择错误，请重新输入");
                        main(args);
                }
            } catch (InputMismatchException e) {
                System.out.println("选择错误，请重新输入！");
                main(args);
            }
        }while (true);

    }
}
class asc2hex{
    static String asc2hex(String asc){
        StringBuffer result = new StringBuffer();
        int length = asc.length();
        for (int i = 0;i<length;i++){
            result.append((Integer.toHexString(asc.charAt(i))));
        }
        return String.valueOf(result);
    }
    static String hex2asc(String hex){
        StringBuffer result = new StringBuffer();
        int length = hex.length();
        for (int i = 0;i<length;i+=2){
            result.append((char) (Integer.parseInt(hex.substring(i,(i+2)))));
        }
        return String.valueOf(result);
    }
}
