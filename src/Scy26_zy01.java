import java.util.Scanner;
public class Scy26_zy01 {
    public static void main(String[] args){
        int hours,minute,minutes;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入换算前分钟：");
        minutes = scanner.nextInt();
        hours = minutes / 60;
        minute = minutes%60;
        System.out.println(minutes + "分钟 可以换算为 ："+hours + "小时" + minute + "分钟");
    }
}
